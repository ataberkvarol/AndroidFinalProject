package com.example.foodcartfinalproject.databinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFoodDetailBindingImpl extends FragmentFoodDetailBinding implements com.example.foodcartfinalproject.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.foodImage, 5);
        sViewsWithIds.put(R.id.quantityText, 6);
        sViewsWithIds.put(R.id.buttonDecreaseQuantity, 7);
        sViewsWithIds.put(R.id.buttonIncreaseQuantity, 8);
        sViewsWithIds.put(R.id.toolbarDetailPage, 9);
        sViewsWithIds.put(R.id.addToCartDetail, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFoodDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentFoodDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[10]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            );
        this.fabDetail.setTag(null);
        this.foodNameText.setTag(null);
        this.foodPriceText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.foodcartfinalproject.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.foodVariable == variableId) {
            setFoodVariable((com.example.foodcartfinalproject.data.entity.Foods) variable);
        }
        else if (BR.detailPageFragment == variableId) {
            setDetailPageFragment((com.example.foodcartfinalproject.ui.fragment.FoodsDetailFragment) variable);
        }
        else if (BR.toolbarDetailPageData == variableId) {
            setToolbarDetailPageData((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodVariable(@Nullable com.example.foodcartfinalproject.data.entity.Foods FoodVariable) {
        this.mFoodVariable = FoodVariable;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodVariable);
        super.requestRebind();
    }
    public void setDetailPageFragment(@Nullable com.example.foodcartfinalproject.ui.fragment.FoodsDetailFragment DetailPageFragment) {
        this.mDetailPageFragment = DetailPageFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.detailPageFragment);
        super.requestRebind();
    }
    public void setToolbarDetailPageData(@Nullable java.lang.String ToolbarDetailPageData) {
        this.mToolbarDetailPageData = ToolbarDetailPageData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.toolbarDetailPageData);
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
        com.example.foodcartfinalproject.data.entity.Foods foodVariable = mFoodVariable;
        java.lang.String javaLangStringPriceStringValueOfFoodVariableYemekFiyatJavaLangString = null;
        java.lang.String stringValueOfFoodVariableYemekFiyat = null;
        java.lang.String foodVariableYemekAdi = null;
        java.lang.String javaLangStringPriceStringValueOfFoodVariableYemekFiyat = null;
        com.example.foodcartfinalproject.ui.fragment.FoodsDetailFragment detailPageFragment = mDetailPageFragment;
        int foodVariableYemekFiyat = 0;
        java.lang.String toolbarDetailPageData = mToolbarDetailPageData;

        if ((dirtyFlags & 0x9L) != 0) {



                if (foodVariable != null) {
                    // read foodVariable.yemek_adi
                    foodVariableYemekAdi = foodVariable.getYemek_adi();
                    // read foodVariable.yemek_fiyat
                    foodVariableYemekFiyat = foodVariable.getYemek_fiyat();
                }


                // read String.valueOf(foodVariable.yemek_fiyat)
                stringValueOfFoodVariableYemekFiyat = java.lang.String.valueOf(foodVariableYemekFiyat);


                // read ("Price ") + (String.valueOf(foodVariable.yemek_fiyat))
                javaLangStringPriceStringValueOfFoodVariableYemekFiyat = ("Price ") + (stringValueOfFoodVariableYemekFiyat);


                // read (("Price ") + (String.valueOf(foodVariable.yemek_fiyat))) + (" ₺")
                javaLangStringPriceStringValueOfFoodVariableYemekFiyatJavaLangString = (javaLangStringPriceStringValueOfFoodVariableYemekFiyat) + (" ₺");
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fabDetail.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.foodNameText, foodVariableYemekAdi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.foodPriceText, javaLangStringPriceStringValueOfFoodVariableYemekFiyatJavaLangString);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, toolbarDetailPageData);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // detailPageFragment != null
        boolean detailPageFragmentJavaLangObjectNull = false;
        // detailPageFragment
        com.example.foodcartfinalproject.ui.fragment.FoodsDetailFragment detailPageFragment = mDetailPageFragment;



        detailPageFragmentJavaLangObjectNull = (detailPageFragment) != (null);
        if (detailPageFragmentJavaLangObjectNull) {



            detailPageFragment.goToCart(fabDetail);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodVariable
        flag 1 (0x2L): detailPageFragment
        flag 2 (0x3L): toolbarDetailPageData
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}