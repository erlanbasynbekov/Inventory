package com.example.inventory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bJ \u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\bJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH\u0002J&\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/inventory/InventoryViewModel;", "Landroidx/lifecycle/ViewModel;", "itemDao", "Lcom/example/inventory/data/ItemDao;", "(Lcom/example/inventory/data/ItemDao;)V", "allItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/inventory/data/Item;", "getAllItems", "()Landroidx/lifecycle/LiveData;", "addNewItem", "", "itemName", "", "itemPrice", "itemCount", "deleteItem", "item", "getNewItemEntry", "getUpdatedItemEntry", "itemId", "", "insertItem", "isEntryValid", "", "isStockAvailable", "retrieveItem", "id", "sellItem", "updateItem", "app_debug"})
public final class InventoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.inventory.data.ItemDao itemDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.inventory.data.Item>> allItems = null;
    
    public InventoryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.inventory.data.ItemDao itemDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.inventory.data.Item>> getAllItems() {
        return null;
    }
    
    public final boolean isStockAvailable(@org.jetbrains.annotations.NotNull()
    com.example.inventory.data.Item item) {
        return false;
    }
    
    public final void updateItem(int itemId, @org.jetbrains.annotations.NotNull()
    java.lang.String itemName, @org.jetbrains.annotations.NotNull()
    java.lang.String itemPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String itemCount) {
    }
    
    private final void updateItem(com.example.inventory.data.Item item) {
    }
    
    public final void sellItem(@org.jetbrains.annotations.NotNull()
    com.example.inventory.data.Item item) {
    }
    
    public final void addNewItem(@org.jetbrains.annotations.NotNull()
    java.lang.String itemName, @org.jetbrains.annotations.NotNull()
    java.lang.String itemPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String itemCount) {
    }
    
    private final void insertItem(com.example.inventory.data.Item item) {
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    com.example.inventory.data.Item item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.inventory.data.Item> retrieveItem(int id) {
        return null;
    }
    
    public final boolean isEntryValid(@org.jetbrains.annotations.NotNull()
    java.lang.String itemName, @org.jetbrains.annotations.NotNull()
    java.lang.String itemPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String itemCount) {
        return false;
    }
    
    private final com.example.inventory.data.Item getNewItemEntry(java.lang.String itemName, java.lang.String itemPrice, java.lang.String itemCount) {
        return null;
    }
    
    private final com.example.inventory.data.Item getUpdatedItemEntry(int itemId, java.lang.String itemName, java.lang.String itemPrice, java.lang.String itemCount) {
        return null;
    }
}