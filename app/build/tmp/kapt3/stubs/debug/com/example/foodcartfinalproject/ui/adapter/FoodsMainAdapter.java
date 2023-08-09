package com.example.foodcartfinalproject.ui.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u00020\u00182\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u001aH\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001aH\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006*"}, d2 = {"Lcom/example/foodcartfinalproject/ui/adapter/FoodsMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodcartfinalproject/ui/adapter/FoodsMainAdapter$CardDesignHolder;", "mContext", "Landroid/content/Context;", "foodList", "", "Lcom/example/foodcartfinalproject/data/entity/Foods;", "viewModel", "Lcom/example/foodcartfinalproject/ui/viewmodel/MainPageViewModel;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/foodcartfinalproject/ui/viewmodel/MainPageViewModel;)V", "getFoodList", "()Ljava/util/List;", "setFoodList", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getViewModel", "()Lcom/example/foodcartfinalproject/ui/viewmodel/MainPageViewModel;", "setViewModel", "(Lcom/example/foodcartfinalproject/ui/viewmodel/MainPageViewModel;)V", "addToBasket", "", "yemek_id", "", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardDesignHolder", "app_debug"})
public final class FoodsMainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter.CardDesignHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.foodcartfinalproject.data.entity.Foods> foodList;
    @org.jetbrains.annotations.NotNull
    private com.example.foodcartfinalproject.ui.viewmodel.MainPageViewModel viewModel;
    
    public FoodsMainAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodcartfinalproject.data.entity.Foods> foodList, @org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.viewmodel.MainPageViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.foodcartfinalproject.data.entity.Foods> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodcartfinalproject.data.entity.Foods> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.ui.viewmodel.MainPageViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.viewmodel.MainPageViewModel p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter.CardDesignHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.adapter.FoodsMainAdapter.CardDesignHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void addToBasket(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/foodcartfinalproject/ui/adapter/FoodsMainAdapter$CardDesignHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "design", "Lcom/example/foodcartfinalproject/databinding/CardMainpageBinding;", "(Lcom/example/foodcartfinalproject/ui/adapter/FoodsMainAdapter;Lcom/example/foodcartfinalproject/databinding/CardMainpageBinding;)V", "getDesign", "()Lcom/example/foodcartfinalproject/databinding/CardMainpageBinding;", "setDesign", "(Lcom/example/foodcartfinalproject/databinding/CardMainpageBinding;)V", "app_debug"})
    public final class CardDesignHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.example.foodcartfinalproject.databinding.CardMainpageBinding design;
        
        public CardDesignHolder(@org.jetbrains.annotations.NotNull
        com.example.foodcartfinalproject.databinding.CardMainpageBinding design) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.foodcartfinalproject.databinding.CardMainpageBinding getDesign() {
            return null;
        }
        
        public final void setDesign(@org.jetbrains.annotations.NotNull
        com.example.foodcartfinalproject.databinding.CardMainpageBinding p0) {
        }
    }
}