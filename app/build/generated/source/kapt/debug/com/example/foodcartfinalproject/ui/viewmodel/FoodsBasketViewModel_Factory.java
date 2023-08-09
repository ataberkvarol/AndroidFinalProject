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
public final class FoodsBasketViewModel_Factory implements Factory<FoodsBasketViewModel> {
  private final Provider<FoodsRepository> frepoProvider;

  public FoodsBasketViewModel_Factory(Provider<FoodsRepository> frepoProvider) {
    this.frepoProvider = frepoProvider;
  }

  @Override
  public FoodsBasketViewModel get() {
    return newInstance(frepoProvider.get());
  }

  public static FoodsBasketViewModel_Factory create(Provider<FoodsRepository> frepoProvider) {
    return new FoodsBasketViewModel_Factory(frepoProvider);
  }

  public static FoodsBasketViewModel newInstance(FoodsRepository frepo) {
    return new FoodsBasketViewModel(frepo);
  }
}
