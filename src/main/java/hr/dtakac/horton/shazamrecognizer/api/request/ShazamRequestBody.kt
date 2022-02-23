package hr.dtakac.horton.shazamrecognizer.api.request

import com.google.gson.annotations.SerializedName

data class ShazamRequestBody(
    @SerializedName("geolocation")
    val geolocation: ShazamGeolocation,
    @SerializedName("signature")
    val signature: ShazamSignature,
    @SerializedName("timestamp")
    val timestamp: Long,
    @SerializedName("timezone")
    val timezone: String
)

data class ShazamGeolocation(
    @SerializedName("altitude")
    val altitude: Short,
    @SerializedName("latitude")
    val latitude: Short,
    @SerializedName("longitude")
    val longitude: Short
)

data class ShazamSignature(
    @SerializedName("samplems")
    val sampleMs: Long,
    @SerializedName("timestamp")
    val timestamp: Long,
    @SerializedName("uri")
    val uri: String
)