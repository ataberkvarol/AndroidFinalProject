// Generated by data binding compiler. Do not edit!
package com.example.foodcartfinalproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.data.entity.FoodsBasket;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CardCartpageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView cardCartFoodImage;

  @NonNull
  public final TextView cardCartFoodName;

  @NonNull
  public final TextView cardCartFoodPrice;

  @NonNull
  public final TextView cardCartQuantity;

  @NonNull
  public final CardView cardViewCart;

  @NonNull
  public final ImageView cartCardDeleteButton;

  @NonNull
  public final TextView textView4;

  @Bindable
  protected FoodsBasket mFoodVariableCart;

  protected CardCartpageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView cardCartFoodImage, TextView cardCartFoodName, TextView cardCartFoodPrice,
      TextView cardCartQuantity, CardView cardViewCart, ImageView cartCardDeleteButton,
      TextView textView4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardCartFoodImage = cardCartFoodImage;
    this.cardCartFoodName = cardCartFoodName;
    this.cardCartFoodPrice = cardCartFoodPrice;
    this.cardCartQuantity = cardCartQuantity;
    this.cardViewCart = cardViewCart;
    this.cartCardDeleteButton = cartCardDeleteButton;
    this.textView4 = textView4;
  }

  public abstract void setFoodVariableCart(@Nullable FoodsBasket foodVariableCart);

  @Nullable
  public FoodsBasket getFoodVariableCart() {
    return mFoodVariableCart;
  }

  @NonNull
  public static CardCartpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_cartpage, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CardCartpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CardCartpageBinding>inflateInternal(inflater, R.layout.card_cartpage, root, attachToRoot, component);
  }

  @NonNull
  public static CardCartpageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_cartpage, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CardCartpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CardCartpageBinding>inflateInternal(inflater, R.layout.card_cartpage, null, false, component);
  }

  public static CardCartpageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CardCartpageBinding bind(@NonNull View view, @Nullable Object component) {
    return (CardCartpageBinding)bind(component, view, R.layout.card_cartpage);
  }
}
