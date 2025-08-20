package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        Product product = new Product();
        product.setProductId(1);
        product.setProductName("Laptop");
        product.setBrand("HP");
        product.setModelName("HP laptop");
        product.setColor("Silver");
        product.setPrice(42990.00);
        product.setItemWeight("1700 grams");

        Amazon amazon = new Amazon();
        boolean addProduct = amazon.addProduct(product);

        if (addProduct){
            amazon.getProductInfo();
        }
        amazon.updateProductPrice(7889.00);
        amazon.getProductInfo();
    }
}
