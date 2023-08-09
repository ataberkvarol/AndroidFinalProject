package com.example.foodcartfinalproject.ui.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0011R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004\u00a8\u0006\u001b"}, d2 = {"Lcom/example/foodcartfinalproject/ui/viewmodel/MainPageViewModel;", "Landroidx/lifecycle/ViewModel;", "frepo", "Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "(Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;)V", "foodList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/foodcartfinalproject/data/entity/Foods;", "getFoodList", "()Landroidx/lifecycle/MutableLiveData;", "setFoodList", "(Landroidx/lifecycle/MutableLiveData;)V", "getFrepo", "()Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "setFrepo", "addToBasket", "", "yemek_id", "", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "startApp", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodcartfinalproject.data.repo.FoodsRepository frepo;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodcartfinalproject.data.entity.Foods>> foodList;
    
    @javax.inject.Inject
    public MainPageViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.repo.FoodsRepository frepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.repo.FoodsRepository getFrepo() {
        return null;
    }
    
    public final void setFrepo(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.repo.FoodsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodcartfinalproject.data.entity.Foods>> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodcartfinalproject.data.entity.Foods>> p0) {
    }
    
    public final void startApp() {
    }
    
    public final void addToBasket(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
    }
}