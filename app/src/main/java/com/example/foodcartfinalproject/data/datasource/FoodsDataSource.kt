package com.example.foodcartfinalproject.data.datasource

import android.util.Log
import com.example.foodcartfinalproject.data.entity.FoodsBasket
import com.example.foodcartfinalproject.data.entity.Foods
import com.example.foodcartfinalproject.retrofit.FoodsDao
import com.example.foodcartfinalproject.utility.UserNameStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodsDataSource(var fdao:FoodsDao) {

    suspend fun addToBasket(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int, yemek_siparis_adet:Int, kullanici_adi:String){
        fdao.addToBasket(yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet =1,kullanici_adi)
    }

    suspend fun loadFoodsToMain() : List<Foods> =
        withContext(Dispatchers.IO){
            return@withContext fdao.loadFoods().yemekler
        }


    suspend fun addToBasketFromDetail(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int,
                                      yemek_siparis_adet:Int, kullanici_adi:String){
        val checkBasketList = loadFoodsToBasket() ?: emptyList()
        var checkFlag = false
        var checkFoodQuantity = 0
        var checkBasketId = 0

        if (checkBasketList.isNotEmpty()){
            for(x: FoodsBasket in checkBasketList){
                if (x.yemek_adi == yemek_adi && x.yemek_resim_adi == yemek_resim_adi && x.yemek_fiyat == yemek_fiyat){
                    checkFoodQuantity = x.yemek_siparis_adet
                    checkBasketId = x.sepet_yemek_id
                    checkFlag = true
                    break
                }
            }
        }
        if(checkFlag){
            deleteFood(checkBasketId, UserNameStatic.user_name)
            val newQuantity = yemek_siparis_adet + checkFoodQuantity
            fdao.addToBasket(yemek_adi,yemek_resim_adi,yemek_fiyat,newQuantity,kullanici_adi)
        }else{
            fdao.addToBasket(yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
        }
    }

    suspend fun deleteFood(yemek_id: Int,kullanici_adi: String){
        fdao.deleteFoods(yemek_id,kullanici_adi)
    }

    suspend fun increaseQuantity(yemek_id: Int,quantity : Int){
        Log.e("quantity","$yemek_id increased----$quantity")
    }

    suspend fun decreaseQuantity(yemek_id: Int,quantity : Int){
        Log.e("quantity","$yemek_id decreased----$quantity")
    }


    suspend fun loadFoodsToBasket(): List<FoodsBasket> {
        return try {
            withContext(Dispatchers.IO) {
                fdao.loadFoodsFromBasket(UserNameStatic.user_name).sepet_yemekler
            }
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

}