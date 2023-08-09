package com.example.foodcartfinalproject;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.foodcartfinalproject.databinding.CardCartpageBindingImpl;
import com.example.foodcartfinalproject.databinding.CardMainpageBindingImpl;
import com.example.foodcartfinalproject.databinding.FragmentFoodBasketBindingImpl;
import com.example.foodcartfinalproject.databinding.FragmentFoodDetailBindingImpl;
import com.example.foodcartfinalproject.databinding.FragmentMainPageBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CARDCARTPAGE = 1;

  private static final int LAYOUT_CARDMAINPAGE = 2;

  private static final int LAYOUT_FRAGMENTFOODBASKET = 3;

  private static final int LAYOUT_FRAGMENTFOODDETAIL = 4;

  private static final int LAYOUT_FRAGMENTMAINPAGE = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodcartfinalproject.R.layout.card_cartpage, LAYOUT_CARDCARTPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodcartfinalproject.R.layout.card_mainpage, LAYOUT_CARDMAINPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodcartfinalproject.R.layout.fragment_food_basket, LAYOUT_FRAGMENTFOODBASKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodcartfinalproject.R.layout.fragment_food_detail, LAYOUT_FRAGMENTFOODDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodcartfinalproject.R.layout.fragment_main_page, LAYOUT_FRAGMENTMAINPAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CARDCARTPAGE: {
          if ("layout/card_cartpage_0".equals(tag)) {
            return new CardCartpageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_cartpage is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDMAINPAGE: {
          if ("layout/card_mainpage_0".equals(tag)) {
            return new CardMainpageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_mainpage is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODBASKET: {
          if ("layout/fragment_food_basket_0".equals(tag)) {
            return new FragmentFoodBasketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_basket is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODDETAIL: {
          if ("layout/fragment_food_detail_0".equals(tag)) {
            return new FragmentFoodDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINPAGE: {
          if ("layout/fragment_main_page_0".equals(tag)) {
            return new FragmentMainPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_page is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(12);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "cartPageFragment");
      sKeys.put(2, "detailPageFragment");
      sKeys.put(3, "foodBasketAdapter");
      sKeys.put(4, "foodMainAdapter");
      sKeys.put(5, "foodVariable");
      sKeys.put(6, "foodVariableCart");
      sKeys.put(7, "foodVariableMain");
      sKeys.put(8, "mainPageFragment");
      sKeys.put(9, "toolbarCartPageData");
      sKeys.put(10, "toolbarDetailPageData");
      sKeys.put(11, "toolbarMainPageData");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/card_cartpage_0", com.example.foodcartfinalproject.R.layout.card_cartpage);
      sKeys.put("layout/card_mainpage_0", com.example.foodcartfinalproject.R.layout.card_mainpage);
      sKeys.put("layout/fragment_food_basket_0", com.example.foodcartfinalproject.R.layout.fragment_food_basket);
      sKeys.put("layout/fragment_food_detail_0", com.example.foodcartfinalproject.R.layout.fragment_food_detail);
      sKeys.put("layout/fragment_main_page_0", com.example.foodcartfinalproject.R.layout.fragment_main_page);
    }
  }
}
