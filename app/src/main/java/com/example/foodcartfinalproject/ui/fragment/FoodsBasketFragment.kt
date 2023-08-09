package com.example.foodcartfinalproject.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.foodcartfinalproject.R
import com.example.foodcartfinalproject.databinding.FragmentFoodBasketBinding
import com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter
import com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodsBasketFragment : Fragment() {
    private lateinit var binding: FragmentFoodBasketBinding
    private lateinit var viewModel: FoodsBasketViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel.basketFoodList.observe(viewLifecycleOwner){
            val adapter = it?.let { it1 -> FoodsBasketAdapter(requireContext(), it1,viewModel) }
            binding.foodBasketAdapter = adapter
        }

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_food_basket,container,false)
        binding.cartPageFragment = this
        binding.toolbarCartPageData = "My shoppingBasket"


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:FoodsBasketViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadFoodsToCart()
    }
}