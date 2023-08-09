package com.example.foodcartfinalproject.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodcartfinalproject.R
import com.example.foodcartfinalproject.databinding.CardCartpageBinding
import com.example.foodcartfinalproject.data.entity.FoodsBasket
import com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel
import com.example.foodcartfinalproject.utility.UserNameStatic
import com.google.android.material.snackbar.Snackbar

class FoodsBasketAdapter(var mContext: Context, var foodsBasketList: List<FoodsBasket>, var viewModel: FoodsBasketViewModel)
    : RecyclerView.Adapter<FoodsBasketAdapter.CardDesignHolderBasket>() {

    inner class CardDesignHolderBasket(var design: CardCartpageBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolderBasket {
        val binding : CardCartpageBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
            R.layout.card_cartpage,parent,false)
        return CardDesignHolderBasket(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolderBasket, position: Int) {
            val foodsBasket = foodsBasketList.get(position)
            val d = holder.design
            d.foodVariableCart = foodsBasket

            val url = "http://kasimadalan.pe.hu/yemekler/resimler/${foodsBasket.yemek_resim_adi}"
            getImageFromGlide(url,d.cardCartFoodImage)

        d.cartCardDeleteButton.setOnClickListener {
            Snackbar.make(it, "${foodsBasket.yemek_adi} discard?", Snackbar.LENGTH_SHORT)
                .setAction("Yes") {
                    deleteFood(foodsBasket.sepet_yemek_id, kullanici_adi = UserNameStatic.user_name)
                }.show()
        }
    }

    fun getImageFromGlide(url: String, cardCartFoodImage: ImageView) {
        Glide.with(mContext).load(url).override(300,300).into(cardCartFoodImage)
    }

    override fun getItemCount(): Int {
        return foodsBasketList.size
    }

    fun deleteFood(yemek_id: Int,kullanici_adi:String){
        viewModel.deleteFood(yemek_id,kullanici_adi)
    }

}