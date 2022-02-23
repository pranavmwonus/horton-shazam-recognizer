package hr.dtakac.horton.shazamrecognizer.api

import hr.dtakac.horton.shazamrecognizer.api.request.ShazamRequestBody
import hr.dtakac.horton.shazamrecognizer.api.response.ShazamResponseBody
import retrofit2.http.*

interface ShazamApiInterface {
    @Headers("Content-Language: en-US")
    @POST("/discovery/v5/en/US/android/-/tag/{uuid1}/{uuid2}" +
            "?sync=true" +
            "&webv3=true" +
            "&sampling=true" +
            "&connected" +
            "&shazamapiversion=v3" +
            "&sharehub=true" +
            "&video=v3"
    )
    suspend fun discovery(
        @Header("User-Agent") userAgent: String,
        @Path("uuid1") uuid1: String,
        @Path("uuid2") uuid2: String,
        @Body body: ShazamRequestBody
    ): ShazamResponseBody
}