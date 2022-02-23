package hr.dtakac.horton.shazamrecognizer.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/di/ShazamRecognizerModule;", "", "()V", "bindShazamFingerprintGenerator", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/ShazamFingerprintGenerator;", "impl", "Lhr/dtakac/horton/shazamrecognizer/fingerprint/NativeShazamFingerprintGenerator;", "bindSongRecognizer", "Lhr/dtakac/horton/domain/recognizer/SongRecognizer;", "Lhr/dtakac/horton/shazamrecognizer/ShazamSongRecognizer;", "Companion", "shazamrecognizer_debug"})
@dagger.Module()
public abstract class ShazamRecognizerModule {
    @org.jetbrains.annotations.NotNull()
    public static final hr.dtakac.horton.shazamrecognizer.di.ShazamRecognizerModule.Companion Companion = null;
    
    public ShazamRecognizerModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator bindShazamFingerprintGenerator(@org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.fingerprint.NativeShazamFingerprintGenerator impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract hr.dtakac.horton.domain.recognizer.SongRecognizer bindSongRecognizer(@org.jetbrains.annotations.NotNull()
    hr.dtakac.horton.shazamrecognizer.ShazamSongRecognizer impl);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lhr/dtakac/horton/shazamrecognizer/di/ShazamRecognizerModule$Companion;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "provideShazamApiInterface", "Lhr/dtakac/horton/shazamrecognizer/api/ShazamApiInterface;", "shazamrecognizer_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface provideShazamApiInterface() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.google.gson.Gson provideGson() {
            return null;
        }
    }
}