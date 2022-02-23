package hr.dtakac.horton.shazamrecognizer.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ShazamRecognizerModule_Companion_ProvideGsonFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return provideGson();
  }

  public static ShazamRecognizerModule_Companion_ProvideGsonFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson provideGson() {
    return Preconditions.checkNotNullFromProvides(ShazamRecognizerModule.Companion.provideGson());
  }

  private static final class InstanceHolder {
    private static final ShazamRecognizerModule_Companion_ProvideGsonFactory INSTANCE = new ShazamRecognizerModule_Companion_ProvideGsonFactory();
  }
}
