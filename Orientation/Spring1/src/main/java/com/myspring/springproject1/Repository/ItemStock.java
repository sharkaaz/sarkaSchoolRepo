package com.myspring.springproject1.Repository;

import com.myspring.springproject1.Model.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {

    private List<ShopItem> itemstock;


    public ItemStock() {
        this.itemstock = new ArrayList<>();
        itemstock.add(new ShopItem("Running shoes","Nike running shoes for every day sport",1000.0,5));
        itemstock.add(new ShopItem("Printer","Some HP printer that will print pages",3000.0,2));
        itemstock.add(new ShopItem("Coca Cola","0.5l standard coke",25.0,0));
        itemstock.add(new ShopItem("Wokin","Chicken with fried rice and WOKIN sauce",119.0,100));
        itemstock.add(new ShopItem("T-Shirt","Blue with a corgi on a biket",300.0,1));
    }
    public void addItem (ShopItem item){
        this.itemstock.add(item);
    }

    public List<ShopItem> getItemstock() {
        return itemstock;
    }

    public void setItemstock(List<ShopItem> itemstock) {
        this.itemstock = itemstock;
    }


}
