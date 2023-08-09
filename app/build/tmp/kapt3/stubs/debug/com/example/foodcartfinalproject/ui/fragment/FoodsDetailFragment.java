package com.example.foodcartfinalproject.ui.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/foodcartfinalproject/ui/fragment/FoodsDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/foodcartfinalproject/databinding/FragmentFoodDetailBinding;", "checkSameFood", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "", "getCheckSameFood", "()Ljava/util/ArrayList;", "quantity", "getQuantity", "()I", "setQuantity", "(I)V", "viewModel", "Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsDetailViewModel;", "addToCartFromDetail", "", "yemek_id", "yemek_adi", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "decreaseQuantity", "goToCart", "it", "Landroid/view/View;", "increaseQuantity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class FoodsDetailFragment extends androidx.fragment.app.Fragment {
    private com.example.foodcartfinalproject.databinding.FragmentFoodDetailBinding binding;
    private com.example.foodcartfinalproject.ui.viewmodel.FoodsDetailViewModel viewModel;
    private int quantity = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.Integer>> checkSameFood = null;
    
    public FoodsDetailFragment() {
        super();
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.Integer>> getCheckSameFood() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void goToCart(@org.jetbrains.annotations.NotNull
    android.view.View it) {
    }
    
    public final void addToCartFromDetail(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
    }
    
    public final void increaseQuantity(int yemek_id, int quantity) {
    }
    
    public final void decreaseQuantity(int yemek_id, int quantity) {
    }
}