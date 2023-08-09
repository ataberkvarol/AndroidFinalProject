package com.example.foodcartfinalproject.data.entity;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/example/foodcartfinalproject/data/entity/FoodsBasket;", "Ljava/io/Serializable;", "sepet_yemek_id", "", "yemek_adi", "", "yemek_resim_adi", "yemek_fiyat", "yemek_siparis_adet", "kullanici_adi", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getKullanici_adi", "()Ljava/lang/String;", "setKullanici_adi", "(Ljava/lang/String;)V", "getSepet_yemek_id", "()I", "setSepet_yemek_id", "(I)V", "getYemek_adi", "setYemek_adi", "getYemek_fiyat", "setYemek_fiyat", "getYemek_resim_adi", "setYemek_resim_adi", "getYemek_siparis_adet", "setYemek_siparis_adet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class FoodsBasket implements java.io.Serializable {
    private int sepet_yemek_id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String yemek_adi;
    @org.jetbrains.annotations.NotNull
    private java.lang.String yemek_resim_adi;
    private int yemek_fiyat;
    private int yemek_siparis_adet;
    @org.jetbrains.annotations.NotNull
    private java.lang.String kullanici_adi;
    
    public FoodsBasket(int sepet_yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
        super();
    }
    
    public final int getSepet_yemek_id() {
        return 0;
    }
    
    public final void setSepet_yemek_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getYemek_adi() {
        return null;
    }
    
    public final void setYemek_adi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getYemek_resim_adi() {
        return null;
    }
    
    public final void setYemek_resim_adi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getYemek_fiyat() {
        return 0;
    }
    
    public final void setYemek_fiyat(int p0) {
    }
    
    public final int getYemek_siparis_adet() {
        return 0;
    }
    
    public final void setYemek_siparis_adet(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKullanici_adi() {
        return null;
    }
    
    public final void setKullanici_adi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodcartfinalproject.data.entity.FoodsBasket copy(int sepet_yemek_id, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_adi, @org.jetbrains.annotations.NotNull
    java.lang.String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, @org.jetbrains.annotations.NotNull
    java.lang.String kullanici_adi) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}