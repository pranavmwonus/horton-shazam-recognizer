package hr.dtakac.horton.shazamrecognizer.fingerprint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/fingerprint/ShazamFingerprintGenerator;", "", "getFingerprint", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/library/ShazamFingerprintData;", "filePath", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shazamrecognizer_debug"})
public abstract interface ShazamFingerprintGenerator {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFingerprint(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData> continuation);
}