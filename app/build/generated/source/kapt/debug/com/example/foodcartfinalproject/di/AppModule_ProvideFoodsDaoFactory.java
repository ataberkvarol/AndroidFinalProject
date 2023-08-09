package com.example.foodcartfinalproject.di;

import com.example.foodcartfinalproject.retrofit.FoodsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideFoodsDaoFactory implements Factory<FoodsDao> {
  private final AppModule module;

  public AppModule_ProvideFoodsDaoFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public FoodsDao get() {
    return provideFoodsDao(module);
  }

  public static AppModule_ProvideFoodsDaoFactory create(AppModule module) {
    return new AppModule_ProvideFoodsDaoFactory(module);
  }

  public static FoodsDao provideFoodsDao(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFoodsDao());
  }
}
