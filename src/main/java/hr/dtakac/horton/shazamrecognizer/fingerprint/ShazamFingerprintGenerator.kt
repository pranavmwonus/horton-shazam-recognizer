package hr.dtakac.horton.shazamrecognizer.fingerprint

import hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData

interface ShazamFingerprintGenerator {
    suspend fun getFingerprint(filePath: String): ShazamFingerprintData
}