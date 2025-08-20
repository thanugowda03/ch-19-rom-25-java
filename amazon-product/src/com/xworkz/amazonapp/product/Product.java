package com.xworkz.amazonapp.product;

public class Product {

   private int productId;
   private String productName;
   private String brand;
   private String modelName;
   private String color;
   private double price;
   private String itemWeight;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getItemWeight(){
        return itemWeight;
    }
    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }
}

