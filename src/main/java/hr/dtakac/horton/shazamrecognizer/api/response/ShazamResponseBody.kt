package hr.dtakac.horton.shazamrecognizer.api.response

import com.google.gson.annotations.SerializedName

data class ShazamResponseBody(
    @SerializedName("track")
    val track: ShazamTrack?
)

data class ShazamTrack(
    @SerializedName("title")
    val title: String?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("images")
    val images: ShazamImages?
)

data class ShazamImages(
    @SerializedName("background")
    val backgroundUrl: String?,
    @SerializedName("coverart")
    val coverArtUrl: String?,
    @SerializedName("coverarthq")
    val hqCoverArtUrl: String?
)