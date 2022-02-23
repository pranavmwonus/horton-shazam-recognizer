package hr.dtakac.horton.shazamrecognizer.fingerprint;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NativeShazamFingerprintGenerator_Factory implements Factory<NativeShazamFingerprintGenerator> {
  private final Provider<Gson> gsonProvider;

  public NativeShazamFingerprintGenerator_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public NativeShazamFingerprintGenerator get() {
    return newInstance(gsonProvider.get());
  }

  public static NativeShazamFingerprintGenerator_Factory create(Provider<Gson> gsonProvider) {
    return new NativeShazamFingerprintGenerator_Factory(gsonProvider);
  }

  public static NativeShazamFingerprintGenerator newInstance(Gson gson) {
    return new NativeShazamFingerprintGenerator(gson);
  }
}
