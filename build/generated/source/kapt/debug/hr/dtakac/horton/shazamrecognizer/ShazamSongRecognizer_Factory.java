package hr.dtakac.horton.shazamrecognizer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import hr.dtakac.horton.common.coroutines.DispatcherProvider;
import hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface;
import hr.dtakac.horton.shazamrecognizer.fingerprint.ShazamFingerprintGenerator;
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
public final class ShazamSongRecognizer_Factory implements Factory<ShazamSongRecognizer> {
  private final Provider<ShazamApiInterface> shazamApiInterfaceProvider;

  private final Provider<ShazamFingerprintGenerator> shazamFingerprintGeneratorProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public ShazamSongRecognizer_Factory(Provider<ShazamApiInterface> shazamApiInterfaceProvider,
      Provider<ShazamFingerprintGenerator> shazamFingerprintGeneratorProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.shazamApiInterfaceProvider = shazamApiInterfaceProvider;
    this.shazamFingerprintGeneratorProvider = shazamFingerprintGeneratorProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public ShazamSongRecognizer get() {
    return newInstance(shazamApiInterfaceProvider.get(), shazamFingerprintGeneratorProvider.get(), dispatcherProvider.get());
  }

  public static ShazamSongRecognizer_Factory create(
      Provider<ShazamApiInterface> shazamApiInterfaceProvider,
      Provider<ShazamFingerprintGenerator> shazamFingerprintGeneratorProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new ShazamSongRecognizer_Factory(shazamApiInterfaceProvider, shazamFingerprintGeneratorProvider, dispatcherProvider);
  }

  public static ShazamSongRecognizer newInstance(ShazamApiInterface shazamApiInterface,
      ShazamFingerprintGenerator shazamFingerprintGenerator,
      DispatcherProvider dispatcherProvider) {
    return new ShazamSongRecognizer(shazamApiInterface, shazamFingerprintGenerator, dispatcherProvider);
  }
}
