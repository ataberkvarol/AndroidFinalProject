package com.example.foodcartfinalproject.retrofit

import com.example.foodcartfinalproject.data.entity.CRUDResponse
import com.example.foodcartfinalproject.data.entity.FoodsBasketResponse
import com.example.foodcartfinalproject.data.entity.FoodsResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface FoodsDao {

    @POST("yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    suspend fun addToBasket(@Field("yemek_adi")yemek_adi : String,
                            @Field("yemek_resim_adi")yemek_resim_adi : String,
                            @Field("yemek_fiyat")yemek_fiyat : Int,
                            @Field("yemek_siparis_adet")yemek_siparis_adet : Int,
                            @Field("kullanici_adi")kullanici_adi: String) : CRUDResponse

    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun loadFoods() : FoodsResponse

    @POST("yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    suspend fun loadFoodsFromBasket(@Field("kullanici_adi")kullanici_adi: String) : FoodsBasketResponse

    @POST("yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    suspend fun deleteFoods(@Field("sepet_yemek_id")sepet_yemek_id: Int,
                            @Field("kullanici_adi")kullanici_adi: String) : FoodsBasketResponse


}