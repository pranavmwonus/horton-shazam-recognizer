package hr.dtakac.horton.shazamrecognizer.di

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hr.dtakac.horton.shazamrecognizer.Constants
import hr.dtakac.horton.shazamrecognizer.ShazamSongRecognizer
import hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface
import hr.dtakac.horton.shazamrecognizer.fingerprint.NativeShazamFingerprintGenerator
import hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ShazamRecognizerModule {
    companion object {
        @Provides
        @Singleton
        fun provideShazamApiInterface(): ShazamApiInterface {
            val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            val okHttpClient = OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
            return Retrofit.Builder()
                .baseUrl(Constants.SHAZAM_API_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ShazamApiInterface::class.java)
        }

        @Provides
        @Singleton
        fun provideGson(): Gson {
            return Gson()
        }
    }

    @Binds
    abstract fun bindShazamFingerprintGenerator(impl: NativeShazamFingerprintGenerator): ShazamFingerprintGenerator

    @Binds
    abstract fun bindSongRecognizer(impl: ShazamSongRecognizer): hr.dtakac.horton.domain.recognizer.SongRecognizer
}