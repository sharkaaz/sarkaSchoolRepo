package com.myspring.springproject1.Model;

public class ShopItem {

    private String name;
    private String Description;
    private Double price;
    private Integer quantity;

    public ShopItem(String name, String description, Double price, Integer quantity) {
        this.name = name;
        Description = description;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
