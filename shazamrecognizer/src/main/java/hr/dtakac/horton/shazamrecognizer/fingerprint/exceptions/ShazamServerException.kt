package hr.dtakac.horton.shazamrecognizer.fingerprint.exceptions

import hr.dtakac.horton.domain.recognizer.SongRecognizerException

class ShazamServerException(
    message: String? = null,
    cause: Throwable? = null
) : SongRecognizerException(message, cause)