package com.example.foodcartfinalproject.di;

import com.example.foodcartfinalproject.data.datasource.FoodsDataSource;
import com.example.foodcartfinalproject.retrofit.FoodsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvideFoodsDataSourceFactory implements Factory<FoodsDataSource> {
  private final AppModule module;

  private final Provider<FoodsDao> fdaoProvider;

  public AppModule_ProvideFoodsDataSourceFactory(AppModule module,
      Provider<FoodsDao> fdaoProvider) {
    this.module = module;
    this.fdaoProvider = fdaoProvider;
  }

  @Override
  public FoodsDataSource get() {
    return provideFoodsDataSource(module, fdaoProvider.get());
  }

  public static AppModule_ProvideFoodsDataSourceFactory create(AppModule module,
      Provider<FoodsDao> fdaoProvider) {
    return new AppModule_ProvideFoodsDataSourceFactory(module, fdaoProvider);
  }

  public static FoodsDataSource provideFoodsDataSource(AppModule instance, FoodsDao fdao) {
    return Preconditions.checkNotNullFromProvides(instance.provideFoodsDataSource(fdao));
  }
}
