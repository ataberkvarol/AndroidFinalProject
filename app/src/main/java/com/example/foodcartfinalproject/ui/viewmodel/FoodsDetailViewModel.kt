package com.example.foodcartfinalproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.foodcartfinalproject.data.repo.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FoodsDetailViewModel @Inject constructor(var foodsRepository: FoodsRepository) : ViewModel() {

    fun addToBasketFromDetail(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int,
                              yemek_siparis_adet:Int, kullanici_adi:String){
        CoroutineScope(Dispatchers.Main).launch {
            foodsRepository.addToBasketFromDetail(yemek_id,yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
        }

    }

    fun increaseQuantity(yemek_id: Int,quantity : Int){
        CoroutineScope(Dispatchers.Main).launch {
            foodsRepository.increaseQuantity(yemek_id,quantity)
        }
    }

    fun decreaseQuantity(yemek_id: Int,quantity : Int){
        CoroutineScope(Dispatchers.Main).launch {
            foodsRepository.decreaseQuantity(yemek_id,quantity)
        }
    }
}