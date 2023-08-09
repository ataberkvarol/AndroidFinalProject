package com.example.foodcartfinalproject.databinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardCartpageBindingImpl extends CardCartpageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewCart, 4);
        sViewsWithIds.put(R.id.cardCartFoodImage, 5);
        sViewsWithIds.put(R.id.textView4, 6);
        sViewsWithIds.put(R.id.cartCardDeleteButton, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardCartpageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private CardCartpageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.cardCartFoodName.setTag(null);
        this.cardCartFoodPrice.setTag(null);
        this.cardCartQuantity.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.foodVariableCart == variableId) {
            setFoodVariableCart((com.example.foodcartfinalproject.data.entity.FoodsBasket) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodVariableCart(@Nullable com.example.foodcartfinalproject.data.entity.FoodsBasket FoodVariableCart) {
        this.mFoodVariableCart = FoodVariableCart;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodVariableCart);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int foodVariableCartYemekSiparisAdet = 0;
        java.lang.String stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet = null;
        int foodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet = 0;
        java.lang.String foodVariableCartYemekAdi = null;
        java.lang.String stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdetJavaLangString = null;
        com.example.foodcartfinalproject.data.entity.FoodsBasket foodVariableCart = mFoodVariableCart;
        int foodVariableCartYemekFiyat = 0;
        java.lang.String stringValueOfFoodVariableCartYemekSiparisAdet = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodVariableCart != null) {
                    // read foodVariableCart.yemek_siparis_adet
                    foodVariableCartYemekSiparisAdet = foodVariableCart.getYemek_siparis_adet();
                    // read foodVariableCart.yemek_adi
                    foodVariableCartYemekAdi = foodVariableCart.getYemek_adi();
                    // read foodVariableCart.yemek_fiyat
                    foodVariableCartYemekFiyat = foodVariableCart.getYemek_fiyat();
                }


                // read String.valueOf(foodVariableCart.yemek_siparis_adet)
                stringValueOfFoodVariableCartYemekSiparisAdet = java.lang.String.valueOf(foodVariableCartYemekSiparisAdet);
                // read (foodVariableCart.yemek_fiyat) * (foodVariableCart.yemek_siparis_adet)
                foodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet = (foodVariableCartYemekFiyat) * (foodVariableCartYemekSiparisAdet);


                // read String.valueOf((foodVariableCart.yemek_fiyat) * (foodVariableCart.yemek_siparis_adet))
                stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet = java.lang.String.valueOf(foodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet);


                // read (String.valueOf((foodVariableCart.yemek_fiyat) * (foodVariableCart.yemek_siparis_adet))) + (" ₺")
                stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdetJavaLangString = (stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdet) + (" ₺");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardCartFoodName, foodVariableCartYemekAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardCartFoodPrice, stringValueOfFoodVariableCartYemekFiyatFoodVariableCartYemekSiparisAdetJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardCartQuantity, stringValueOfFoodVariableCartYemekSiparisAdet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodVariableCart
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}