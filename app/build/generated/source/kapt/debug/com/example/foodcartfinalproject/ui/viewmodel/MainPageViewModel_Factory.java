package com.example.foodcartfinalproject.ui.viewmodel;

import com.example.foodcartfinalproject.data.repo.FoodsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainPageViewModel_Factory implements Factory<MainPageViewModel> {
  private final Provider<FoodsRepository> frepoProvider;

  public MainPageViewModel_Factory(Provider<FoodsRepository> frepoProvider) {
    this.frepoProvider = frepoProvider;
  }

  @Override
  public MainPageViewModel get() {
    return newInstance(frepoProvider.get());
  }

  public static MainPageViewModel_Factory create(Provider<FoodsRepository> frepoProvider) {
    return new MainPageViewModel_Factory(frepoProvider);
  }

  public static MainPageViewModel newInstance(FoodsRepository frepo) {
    return new MainPageViewModel(frepo);
  }
}
