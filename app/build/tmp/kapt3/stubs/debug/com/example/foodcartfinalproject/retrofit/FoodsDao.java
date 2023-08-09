package com.example.foodcartfinalproject.retrofit;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/foodcartfinalproject/retrofit/FoodsDao;", "", "addToBasket", "Lcom/example/foodcartfinalproject/data/entity/CRUDResponse;", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "", "yemek_siparis_adet", "kullanici_adi", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFoods", "Lcom/example/foodcartfinalproject/data/entity/FoodsBasketResponse;", "sepet_yemek_id", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFoods", "Lcom/example/foodcartfinalproject/data/entity/FoodsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFoodsFromBasket", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FoodsDao {
    
    @retrofit2.http.POST(value = "yemekler/sepeteYemekEkle.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToBasket(@retrofit2.http.Field(value = "yemek_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @retrofit2.http.Field(value = "yemek_resim_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, @retrofit2.http.Field(value = "yemek_fiyat")
    int yemek_fiyat, @retrofit2.http.Field(value = "yemek_siparis_adet")
    int yemek_siparis_adet, @retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodcartfinalproject.data.entity.CRUDResponse> $completion);
    
    @retrofit2.http.GET(value = "yemekler/tumYemekleriGetir.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadFoods(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodcartfinalproject.data.entity.FoodsResponse> $completion);
    
    @retrofit2.http.POST(value = "yemekler/sepettekiYemekleriGetir.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadFoodsFromBasket(@retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodcartfinalproject.data.entity.FoodsBasketResponse> $completion);
    
    @retrofit2.http.POST(value = "yemekler/sepettenYemekSil.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFoods(@retrofit2.http.Field(value = "sepet_yemek_id")
    int sepet_yemek_id, @retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodcartfinalproject.data.entity.FoodsBasketResponse> $completion);
}