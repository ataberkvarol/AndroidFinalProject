package com.example.foodcartfinalproject.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodcartfinalproject.R

public class FoodsDetailFragmentDirections private constructor() {
  public companion object {
    public fun detailToCart(): NavDirections = ActionOnlyNavDirections(R.id.detailToCart)
  }
}
