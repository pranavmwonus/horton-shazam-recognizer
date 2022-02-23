package hr.dtakac.horton.shazamrecognizer.mappers

import hr.dtakac.horton.domain.RecognizedSong
import hr.dtakac.horton.shazamrecognizer.api.response.ShazamResponseBody
import hr.dtakac.horton.shazamrecognizer.fingerprint.exceptions.ShazamServerException
import java.time.Instant

object RecognizedSongMapper {
    fun mapShazamResponseBodyToRecognizedSong(shazamResponseBody: ShazamResponseBody): RecognizedSong {
        if (shazamResponseBody.track?.title == null) {
            throw ShazamServerException("Shazam returned body with no track title.")
        } else {
            return RecognizedSong(
                title = shazamResponseBody.track.title,
                subtitle = shazamResponseBody.track.subtitle,
                artUrl = shazamResponseBody.track.images?.coverArtUrl,
                recognitionTimestamp = Instant.now()
            )
        }
    }
}