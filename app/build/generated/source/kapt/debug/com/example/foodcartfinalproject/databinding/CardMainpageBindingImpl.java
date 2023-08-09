package com.example.foodcartfinalproject.databinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardMainpageBindingImpl extends CardMainpageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewMainPage, 3);
        sViewsWithIds.put(R.id.cardFoodImageMain, 4);
        sViewsWithIds.put(R.id.addtoCartCardMainPage, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardMainpageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private CardMainpageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[3]
            );
        this.cardFoodName.setTag(null);
        this.cardFoodPrice.setTag(null);
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
        if (BR.foodVariableMain == variableId) {
            setFoodVariableMain((com.example.foodcartfinalproject.data.entity.Foods) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodVariableMain(@Nullable com.example.foodcartfinalproject.data.entity.Foods FoodVariableMain) {
        this.mFoodVariableMain = FoodVariableMain;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodVariableMain);
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
        java.lang.String stringValueOfFoodVariableMainYemekFiyat = null;
        com.example.foodcartfinalproject.data.entity.Foods foodVariableMain = mFoodVariableMain;
        java.lang.String foodVariableMainYemekAdi = null;
        int foodVariableMainYemekFiyat = 0;
        java.lang.String javaLangStringPriceStringValueOfFoodVariableMainYemekFiyatJavaLangString = null;
        java.lang.String javaLangStringPriceStringValueOfFoodVariableMainYemekFiyat = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodVariableMain != null) {
                    // read foodVariableMain.yemek_adi
                    foodVariableMainYemekAdi = foodVariableMain.getYemek_adi();
                    // read foodVariableMain.yemek_fiyat
                    foodVariableMainYemekFiyat = foodVariableMain.getYemek_fiyat();
                }


                // read String.valueOf(foodVariableMain.yemek_fiyat)
                stringValueOfFoodVariableMainYemekFiyat = java.lang.String.valueOf(foodVariableMainYemekFiyat);


                // read ("Price ") + (String.valueOf(foodVariableMain.yemek_fiyat))
                javaLangStringPriceStringValueOfFoodVariableMainYemekFiyat = ("Price ") + (stringValueOfFoodVariableMainYemekFiyat);


                // read (("Price ") + (String.valueOf(foodVariableMain.yemek_fiyat))) + (" ₺")
                javaLangStringPriceStringValueOfFoodVariableMainYemekFiyatJavaLangString = (javaLangStringPriceStringValueOfFoodVariableMainYemekFiyat) + (" ₺");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardFoodName, foodVariableMainYemekAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardFoodPrice, javaLangStringPriceStringValueOfFoodVariableMainYemekFiyatJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodVariableMain
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}