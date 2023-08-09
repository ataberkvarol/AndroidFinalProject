package com.example.foodcartfinalproject.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodcartfinalproject.data.entity.FoodsBasket
import com.example.foodcartfinalproject.data.repo.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FoodsBasketViewModel @Inject constructor(var frepo: FoodsRepository) : ViewModel() {
    var basketFoodList = MutableLiveData<List<FoodsBasket>?>()

    init {
            loadFoodsToCart()
    }

    fun loadFoodsToCart(){
        CoroutineScope(Dispatchers.Main).launch {
            basketFoodList.value = frepo.loadFoodsToCart()
        }
    }
    fun deleteFood(yemek_id: Int, kullanici_adi: String) {
        CoroutineScope(Dispatchers.Main).launch {
            frepo.deleteFood(yemek_id, kullanici_adi)

            val newList = basketFoodList.value?.toMutableList()
            newList?.removeAll { it.sepet_yemek_id == yemek_id }
            basketFoodList.value = newList
        }
    }
}