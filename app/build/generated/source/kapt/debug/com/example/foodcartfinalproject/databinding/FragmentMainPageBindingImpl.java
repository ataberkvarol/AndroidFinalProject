package com.example.foodcartfinalproject.databinding;
import com.example.foodcartfinalproject.R;
import com.example.foodcartfinalproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainPageBindingImpl extends FragmentMainPageBinding implements com.example.foodcartfinalproject.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarMainPage, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentMainPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.fabMain.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.rvMain.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.foodcartfinalproject.generated.callback.OnClickListener(this, 1);
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
        if (BR.toolbarMainPageData == variableId) {
            setToolbarMainPageData((java.lang.String) variable);
        }
        else if (BR.foodMainAdapter == variableId) {
            setFoodMainAdapter((com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter) variable);
        }
        else if (BR.mainPageFragment == variableId) {
            setMainPageFragment((com.example.foodcartfinalproject.ui.fragment.MainPageFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setToolbarMainPageData(@Nullable java.lang.String ToolbarMainPageData) {
        this.mToolbarMainPageData = ToolbarMainPageData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.toolbarMainPageData);
        super.requestRebind();
    }
    public void setFoodMainAdapter(@Nullable com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter FoodMainAdapter) {
        this.mFoodMainAdapter = FoodMainAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.foodMainAdapter);
        super.requestRebind();
    }
    public void setMainPageFragment(@Nullable com.example.foodcartfinalproject.ui.fragment.MainPageFragment MainPageFragment) {
        this.mMainPageFragment = MainPageFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainPageFragment);
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
        java.lang.String toolbarMainPageData = mToolbarMainPageData;
        com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter foodMainAdapter = mFoodMainAdapter;
        com.example.foodcartfinalproject.ui.fragment.MainPageFragment mainPageFragment = mMainPageFragment;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fabMain.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, toolbarMainPageData);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.rvMain.setAdapter(foodMainAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainPageFragment
        com.example.foodcartfinalproject.ui.fragment.MainPageFragment mainPageFragment = mMainPageFragment;
        // mainPageFragment != null
        boolean mainPageFragmentJavaLangObjectNull = false;



        mainPageFragmentJavaLangObjectNull = (mainPageFragment) != (null);
        if (mainPageFragmentJavaLangObjectNull) {



            mainPageFragment.goToCart(fabMain);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbarMainPageData
        flag 1 (0x2L): foodMainAdapter
        flag 2 (0x3L): mainPageFragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}