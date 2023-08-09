package com.example.foodcartfinalproject.ui.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u00020\u00182\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u001aH\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001aH\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006*"}, d2 = {"Lcom/example/foodcartfinalproject/ui/adapter/FoodsBasketAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodcartfinalproject/ui/adapter/FoodsBasketAdapter$CardDesignHolderBasket;", "mContext", "Landroid/content/Context;", "foodsBasketList", "", "Lcom/example/foodcartfinalproject/data/entity/FoodsBasket;", "viewModel", "Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsBasketViewModel;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsBasketViewModel;)V", "getFoodsBasketList", "()Ljava/util/List;", "setFoodsBasketList", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getViewModel", "()Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsBasketViewModel;", "setViewModel", "(Lcom/example/foodcartfinalproject/ui/viewmodel/FoodsBasketViewModel;)V", "deleteFood", "", "yemek_id", "", "kullanici_adi", "", "getImageFromGlide", "url", "cardCartFoodImage", "Landroid/widget/ImageView;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardDesignHolderBasket", "app_debug"})
public final class FoodsBasketAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter.CardDesignHolderBasket> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.foodcartfinalproject.data.entity.FoodsBasket> foodsBasketList;
    @org.jetbrains.annotations.NotNull
    private com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel viewModel;
    
    public FoodsBasketAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodcartfinalproject.data.entity.FoodsBasket> foodsBasketList, @org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel viewModel) {
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
    public final java.util.List<com.example.foodcartfinalproject.data.entity.FoodsBasket> getFoodsBasketList() {
        return null;
    }
    
    public final void setFoodsBasketList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodcartfinalproject.data.entity.FoodsBasket> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.viewmodel.FoodsBasketViewModel p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter.CardDesignHolderBasket onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodcartfinalproject.ui.adapter.FoodsBasketAdapter.CardDesignHolderBasket holder, int position) {
    }
    
    public final void getImageFromGlide(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView cardCartFoodImage) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void deleteFood(int yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/foodcartfinalproject/ui/adapter/FoodsBasketAdapter$CardDesignHolderBasket;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "design", "Lcom/example/foodcartfinalproject/databinding/CardCartpageBinding;", "(Lcom/example/foodcartfinalproject/ui/adapter/FoodsBasketAdapter;Lcom/example/foodcartfinalproject/databinding/CardCartpageBinding;)V", "getDesign", "()Lcom/example/foodcartfinalproject/databinding/CardCartpageBinding;", "setDesign", "(Lcom/example/foodcartfinalproject/databinding/CardCartpageBinding;)V", "app_debug"})
    public final class CardDesignHolderBasket extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.example.foodcartfinalproject.databinding.CardCartpageBinding design;
        
        public CardDesignHolderBasket(@org.jetbrains.annotations.NotNull
        com.example.foodcartfinalproject.databinding.CardCartpageBinding design) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.foodcartfinalproject.databinding.CardCartpageBinding getDesign() {
            return null;
        }
        
        public final void setDesign(@org.jetbrains.annotations.NotNull
        com.example.foodcartfinalproject.databinding.CardCartpageBinding p0) {
        }
    }
}