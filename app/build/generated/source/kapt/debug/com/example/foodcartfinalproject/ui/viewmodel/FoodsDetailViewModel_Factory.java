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
public final class FoodsDetailViewModel_Factory implements Factory<FoodsDetailViewModel> {
  private final Provider<FoodsRepository> foodsRepositoryProvider;

  public FoodsDetailViewModel_Factory(Provider<FoodsRepository> foodsRepositoryProvider) {
    this.foodsRepositoryProvider = foodsRepositoryProvider;
  }

  @Override
  public FoodsDetailViewModel get() {
    return newInstance(foodsRepositoryProvider.get());
  }

  public static FoodsDetailViewModel_Factory create(
      Provider<FoodsRepository> foodsRepositoryProvider) {
    return new FoodsDetailViewModel_Factory(foodsRepositoryProvider);
  }

  public static FoodsDetailViewModel newInstance(FoodsRepository foodsRepository) {
    return new FoodsDetailViewModel(foodsRepository);
  }
}
