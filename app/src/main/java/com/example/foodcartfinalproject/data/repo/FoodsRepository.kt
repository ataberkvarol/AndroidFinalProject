package com.example.foodcartfinalproject.data.repo

import com.example.foodcartfinalproject.data.datasource.FoodsDataSource
import com.example.foodcartfinalproject.data.entity.FoodsBasket
import com.example.foodcartfinalproject.data.entity.Foods

class FoodsRepository(var fds: FoodsDataSource) {

    suspend fun addBasket(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int,
                          yemek_siparis_adet:Int, kullanici_adi:String){
        fds.addToBasket(yemek_id,yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
    }

    suspend fun loadFoodsToMain() : List<Foods> = fds.loadFoodsToMain()

    suspend fun addToBasketFromDetail(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int,
                                      yemek_siparis_adet:Int, kullanici_adi:String){
        fds.addToBasketFromDetail(yemek_id,yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
    }

    suspend fun deleteFood(yemek_id: Int,kullanici_adi: String){
        fds.deleteFood(yemek_id,kullanici_adi)
    }

    suspend fun increaseQuantity(yemek_id: Int,quantity : Int){
        fds.increaseQuantity(yemek_id,quantity)
    }

    suspend fun decreaseQuantity(yemek_id: Int,quantity : Int){
        fds.decreaseQuantity(yemek_id,quantity)
    }

    suspend fun loadFoodsToCart() : List<FoodsBasket> = fds.loadFoodsToBasket()

}