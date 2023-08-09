package com.example.foodcartfinalproject.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodcartfinalproject.R
import com.example.foodcartfinalproject.data.entity.Foods
import com.example.foodcartfinalproject.databinding.CardMainpageBinding
import com.example.foodcartfinalproject.ui.fragment.MainPageFragmentDirections
import com.example.foodcartfinalproject.ui.viewmodel.MainPageViewModel
import com.example.foodcartfinalproject.utility.UserNameStatic

class FoodsMainAdapter(var mContext: Context, var foodList: List<Foods>, var viewModel: MainPageViewModel)
    : RecyclerView.Adapter<FoodsMainAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardMainpageBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding : CardMainpageBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_mainpage,parent,false)
        return CardDesignHolder(binding)
    }
    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {

        val food = foodList.get(position)
        val d = holder.design
        d.foodVariableMain = food

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/${food.yemek_resim_adi}"
        Glide.with(mContext).load(url).override(300,300).into(d.cardFoodImageMain)

        d.addtoCartCardMainPage.setOnClickListener{
            var yemek_id = food.yemek_id
            var yemek_adi = food.yemek_adi
            var yemek_fiyat = food.yemek_fiyat
            var yemek_resim_adi = food.yemek_resim_adi
            var yemek_siparis_adet = 1
            var kullanici_adi = UserNameStatic.user_name
            addToBasket(yemek_id,yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
        }

        d.cardViewMainPage.setOnClickListener{
            val transition = MainPageFragmentDirections.mainToDetail(food = food)
            Navigation.findNavController(it).navigate(transition)
        }

    }
    override fun getItemCount(): Int {
        return foodList.size
    }

    fun addToBasket(yemek_id: Int, yemek_adi:String, yemek_resim_adi:String, yemek_fiyat:Int,
                    yemek_siparis_adet:Int, kullanici_adi:String){
        viewModel.addToBasket(yemek_id,yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi)
    }

}