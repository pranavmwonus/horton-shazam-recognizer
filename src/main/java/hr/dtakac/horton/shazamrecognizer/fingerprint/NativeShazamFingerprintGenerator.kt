package hr.dtakac.horton.shazamrecognizer.fingerprint

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import hr.dtakac.horton.shazamrecognizer.fingerprint.exceptions.FingerprintGeneratorException
import hr.dtakac.horton.shazamrecognizer.fingerprint.library.NativeShazamFingerprintLibrary
import hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData
import javax.inject.Inject
import kotlin.coroutines.suspendCoroutine

class NativeShazamFingerprintGenerator @Inject constructor(
    private val gson: Gson
) : ShazamFingerprintGenerator {
    override suspend fun getFingerprint(filePath: String): ShazamFingerprintData {
        return suspendCoroutine { continuation ->
            val fingerprintJson = NativeShazamFingerprintLibrary.getFingerprintJson(filePath)
            val fingerprintData: ShazamFingerprintData = try {
                gson.fromJson(fingerprintJson, ShazamFingerprintData::class.java)
            } catch (e: JsonSyntaxException) {
                throw FingerprintGeneratorException(
                    message = "Could not generate fingerprint for file at $filePath."
                )
            }
            continuation.resumeWith(result = Result.success(value = fingerprintData))
        }
    }
}