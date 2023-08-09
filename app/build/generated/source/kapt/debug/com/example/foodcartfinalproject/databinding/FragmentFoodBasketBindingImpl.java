package com.example.foodcartfinalproject.databinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFoodBasketBindingImpl extends FragmentFoodBasketBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarCartPage, 3);
        sViewsWithIds.put(R.id.floatingActionButton, 4);
        sViewsWithIds.put(R.id.textView2, 5);
        sViewsWithIds.put(R.id.imageView, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFoodBasketBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFoodBasketBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.rvCart.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.foodBasketAdapter == variableId) {
            setFoodBasketAdapter((com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter) variable);
        }
        else if (BR.cartPageFragment == variableId) {
            setCartPageFragment((com.example.foodcartfinalproject.ui.fragment.FoodsBasketFragment) variable);
        }
        else if (BR.toolbarCartPageData == variableId) {
            setToolbarCartPageData((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodBasketAdapter(@Nullable com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter FoodBasketAdapter) {
        this.mFoodBasketAdapter = FoodBasketAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodBasketAdapter);
        super.requestRebind();
    }
    public void setCartPageFragment(@Nullable com.example.foodcartfinalproject.ui.fragment.FoodsBasketFragment CartPageFragment) {
        this.mCartPageFragment = CartPageFragment;
    }
    public void setToolbarCartPageData(@Nullable java.lang.String ToolbarCartPageData) {
        this.mToolbarCartPageData = ToolbarCartPageData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.toolbarCartPageData);
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
        com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter foodBasketAdapter = mFoodBasketAdapter;
        boolean foodBasketAdapterJavaLangObjectNull = false;
        com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter foodBasketAdapterJavaLangObjectNullFoodBasketAdapterJavaLangObjectNull = null;
        java.lang.String toolbarCartPageData = mToolbarCartPageData;

        if ((dirtyFlags & 0x9L) != 0) {



                // read foodBasketAdapter != null
                foodBasketAdapterJavaLangObjectNull = (foodBasketAdapter) != (null);
            if((dirtyFlags & 0x9L) != 0) {
                if(foodBasketAdapterJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x9L) != 0) {

                // read foodBasketAdapter != null ? foodBasketAdapter : null
                foodBasketAdapterJavaLangObjectNullFoodBasketAdapterJavaLangObjectNull = ((foodBasketAdapterJavaLangObjectNull) ? (foodBasketAdapter) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, toolbarCartPageData);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.rvCart.setAdapter(foodBasketAdapterJavaLangObjectNullFoodBasketAdapterJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodBasketAdapter
        flag 1 (0x2L): cartPageFragment
        flag 2 (0x3L): toolbarCartPageData
        flag 3 (0x4L): null
        flag 4 (0x5L): foodBasketAdapter != null ? foodBasketAdapter : null
        flag 5 (0x6L): foodBasketAdapter != null ? foodBasketAdapter : null
    flag mapping end*/
    //end
}