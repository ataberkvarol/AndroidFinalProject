package com.example.foodcartfinalproject.ui.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "foodsRepository", "Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "(Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;)V", "getFoodsRepository", "()Lcom/example/foodcartfinalproject/data/repo/FoodsRepository;", "setFoodsRepository", "addToBasketFromDetail", "", "yemek_id", "", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "decreaseQuantity", "quantity", "increaseQuantity", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FoodsDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodcartfinalproject.data.repo.FoodsRepository foodsRepository;
    
    @javax.inject.Inject
    public FoodsDetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.repo.FoodsRepository foodsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.repo.FoodsRepository getFoodsRepository() {
        return null;
    }
    
    public final void setFoodsRepository(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.data.repo.FoodsRepository p0) {
    }
    
    public final void addToBasketFromDetail(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
    }
    
    public final void increaseQuantity(int yemek_id, int quantity) {
    }
    
    public final void decreaseQuantity(int yemek_id, int quantity) {
    }
}