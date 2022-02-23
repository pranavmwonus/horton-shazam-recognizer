package hr.dtakac.horton.shazamrecognizer.fingerprint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/fingerprint/NativeShazamFingerprintGenerator;", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/ShazamFingerprintGenerator;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getFingerprint", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/library/ShazamFingerprintData;", "filePath", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shazamrecognizer_debug"})
public final class NativeShazamFingerprintGenerator implements hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator {
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject()
    public NativeShazamFingerprintGenerator(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFingerprint(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData> continuation) {
        return null;
    }
}