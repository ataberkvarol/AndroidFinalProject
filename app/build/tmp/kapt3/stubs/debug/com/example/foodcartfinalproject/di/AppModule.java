package com.example.foodcartfinalproject.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/foodcartfinalproject/di/AppModule;", "", "()V", "provideFoodsDao", "Lcom/example/foodcartfinalproject/retrofit/FoodsDao;", "provideFoodsDataSource", "Lcom/example/foodcartfinalproject/data/datasource/FoodsDataSource;", "fdao", "provideFoodsRepository", "Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "fds", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.repo.FoodsRepository provideFoodsRepository(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.datasource.FoodsDataSource fds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.datasource.FoodsDataSource provideFoodsDataSource(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.retrofit.FoodsDao fdao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.retrofit.FoodsDao provideFoodsDao() {
        return null;
    }
}