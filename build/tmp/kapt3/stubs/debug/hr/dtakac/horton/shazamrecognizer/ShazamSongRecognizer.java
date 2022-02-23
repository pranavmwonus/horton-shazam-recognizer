package hr.dtakac.horton.shazamrecognizer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0014"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/ShazamSongRecognizer;", "Lhr/dtakac/horton/domain/recognizer/SongRecognizer;", "shazamApiInterface", "Lhr/dtakac/horton/shazamrecognizer/api/ShazamApiInterface;", "shazamFingerprintGenerator", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/ShazamFingerprintGenerator;", "dispatcherProvider", "Lhr/dtakac/horton/common/coroutines/DispatcherProvider;", "(Lhr/dtakac/horton/shazamrecognizer/api/ShazamApiInterface;Lhr/dtakac/horton/shazamrecognizer/fingerprint/ShazamFingerprintGenerator;Lhr/dtakac/horton/common/coroutines/DispatcherProvider;)V", "buildShazamRequestBody", "Lhr/dtakac/horton/shazamrecognizer/api/request/ShazamRequestBody;", "shazamFingerprintData", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/library/ShazamFingerprintData;", "recognize", "Lkotlin/Result;", "Lhr/dtakac/horton/domain/RecognizedSong;", "songFilePath", "", "recognize-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shazamrecognizer_debug"})
public final class ShazamSongRecognizer implements hr.dtakac.horton.domain.recognizer.SongRecognizer {
    private final hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface shazamApiInterface = null;
    private final hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator shazamFingerprintGenerator = null;
    private final hr.dtakac.horton.common.coroutines.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject()
    public ShazamSongRecognizer(@org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface shazamApiInterface, @org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator shazamFingerprintGenerator, @org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.common.coroutines.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    private final hr.dtakac.horton.shazamrecognizer.api.request.ShazamRequestBody buildShazamRequestBody(hr.dtakac.horton.shazamrecognizer.fingerprint.library.ShazamFingerprintData shazamFingerprintData) {
        return null;
    }
}