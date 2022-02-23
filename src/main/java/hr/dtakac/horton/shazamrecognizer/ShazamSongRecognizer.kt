package hr.dtakac.horton.shazamrecognizer

import hr.dtakac.horton.common.coroutines.DispatcherProvider
import hr.dtakac.horton.domain.RecognizedSong
import hr.dtakac.horton.domain.recognizer.SongRecognizer
import hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface
import hr.dtakac.horton.shazamrecognizer.api.USER_AGENTS
import hr.dtakac.horton.shazamrecognizer.api.request.ShazamGeolocation
import hr.dtakac.horton.shazamrecognizer.api.request.ShazamRequestBody
import hr.dtakac.horton.shazamrecognizer.api.request.ShazamSignature
import hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData
import hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator
import hr.dtakac.horton.shazamrecognizer.mappers.RecognizedSongMapper
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.time.Instant
import java.util.*
import javax.inject.Inject

class ShazamSongRecognizer @Inject constructor(
    private val shazamApiInterface: ShazamApiInterface,
    private val shazamFingerprintGenerator: ShazamFingerprintGenerator,
    private val dispatcherProvider: DispatcherProvider
) : SongRecognizer {
    override suspend fun recognize(songFilePath: String): Result<RecognizedSong> {
        val fingerprintData = try {
            withContext(dispatcherProvider.compute) {
                shazamFingerprintGenerator.getFingerprint(filePath = songFilePath)
            }
        } catch (e: Exception) {
            return Result.failure(exception = e)
        }

        val shazamResponseBody = try {
            withContext(dispatcherProvider.io) {
                shazamApiInterface.discovery(
                    userAgent = USER_AGENTS.random(),
                    uuid1 = UUID.randomUUID().toString().uppercase(),
                    uuid2 = UUID.randomUUID().toString(),
                    body = buildShazamRequestBody(shazamFingerprintData = fingerprintData)
                )
            }
        } catch (e: Exception) {
            return Result.failure(exception = e)
        }

        return try {
            Result.success(
                value = RecognizedSongMapper.mapShazamResponseBodyToRecognizedSong(
                    shazamResponseBody = shazamResponseBody
                )
            )
        } catch (e: Exception) {
            Result.failure(exception = e)
        }
    }

    private fun buildShazamRequestBody(shazamFingerprintData: ShazamFingerprintData): ShazamRequestBody {
        val timestamp = Instant.now().toEpochMilli()
        val timezone = "Europe/Paris"
        val geolocation = ShazamGeolocation(
            altitude = 300,
            latitude = 45,
            longitude = 2
        )
        val signature = ShazamSignature(
            sampleMs = shazamFingerprintData.sampleMs,
            timestamp = timestamp,
            uri = shazamFingerprintData.uri
        )
        return ShazamRequestBody(
            geolocation = geolocation,
            signature = signature,
            timestamp = timestamp,
            timezone = timezone
        )
    }
}