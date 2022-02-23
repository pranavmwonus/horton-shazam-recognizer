package hr.dtakac.horton.shazamrecognizer.fingerprint.exceptions

import hr.dtakac.horton.domain.recognizer.SongRecognizerException

class FingerprintGeneratorException(
    message: String? = null,
    cause: Throwable? = null
) : SongRecognizerException(message, cause)