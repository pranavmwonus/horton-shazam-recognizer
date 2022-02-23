package hr.dtakac.horton.shazamrecognizer.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import hr.dtakac.horton.shazamrecognizer.api.ShazamApiInterface;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShazamRecognizerModule_Companion_ProvideShazamApiInterfaceFactory implements Factory<ShazamApiInterface> {
  @Override
  public ShazamApiInterface get() {
    return provideShazamApiInterface();
  }

  public static ShazamRecognizerModule_Companion_ProvideShazamApiInterfaceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ShazamApiInterface provideShazamApiInterface() {
    return Preconditions.checkNotNullFromProvides(ShazamRecognizerModule.Companion.provideShazamApiInterface());
  }

  private static final class InstanceHolder {
    private static final ShazamRecognizerModule_Companion_ProvideShazamApiInterfaceFactory INSTANCE = new ShazamRecognizerModule_Companion_ProvideShazamApiInterfaceFactory();
  }
}
