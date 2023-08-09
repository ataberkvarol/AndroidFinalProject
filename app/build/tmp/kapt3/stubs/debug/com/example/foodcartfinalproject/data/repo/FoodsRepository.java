package com.example.foodcartfinalproject.data.repo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012JA\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "", "fds", "Lcom/example/foodcartfinalproject/data/datasource/FoodsDataSource;", "(Lcom/example/foodcartfinalproject/data/datasource/FoodsDataSource;)V", "getFds", "()Lcom/example/foodcartfinalproject/data/datasource/FoodsDataSource;", "setFds", "addBasket", "", "yemek_id", "", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToBasketFromDetail", "decreaseQuantity", "quantity", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFood", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "increaseQuantity", "loadFoodsToCart", "", "Lcom/example/foodcartfinalproject/data/entity/FoodsBasket;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFoodsToMain", "Lcom/example/foodcartfinalproject/data/entity/Foods;", "app_debug"})
public final class FoodsRepository {
    @org.jetbrains.annotations.NotNull
    private com.example.foodcartfinalproject.data.datasource.FoodsDataSource fds;
    
    public FoodsRepository(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.datasource.FoodsDataSource fds) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.datasource.FoodsDataSource getFds() {
        return null;
    }
    
    public final void setFds(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.datasource.FoodsDataSource p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addBasket(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadFoodsToMain(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodcartfinalproject.data.entity.Foods>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToBasketFromDetail(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFood(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object increaseQuantity(int yemek_id, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object decreaseQuantity(int yemek_id, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadFoodsToCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodcartfinalproject.data.entity.FoodsBasket>> $completion) {
        return null;
    }
}