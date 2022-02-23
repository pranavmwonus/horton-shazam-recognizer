package hr.dtakac.horton.shazamrecognizer.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/api/ShazamApiInterface;", "", "discovery", "Lhr/dtakac/horton/shazamrecognizer/api/response/ShazamResponseBody;", "userAgent", "", "uuid1", "uuid2", "body", "Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamRequestBody;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shazamrecognizer_debug"})
public abstract interface ShazamApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/discovery/v5/en/US/android/-/tag/{uuid1}/{uuid2}?sync=true&webv3=true&sampling=true&connected&shazamapiversion=v3&sharehub=true&video=v3")
    @retrofit2.http.Headers(value = {"Content-Language: en-US"})
    public abstract java.lang.Object discovery(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "User-Agent")
    java.lang.String userAgent, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uuid1")
    java.lang.String uuid1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uuid2")
    java.lang.String uuid2, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    hr.dtakac.horton.shazamrecognizer.api.request.ShazamRequestBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hr.dtakac.horton.shazamrecognizer.api.response.ShazamResponseBody> continuation);
}