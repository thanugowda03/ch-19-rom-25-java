package com.xworkz.amazonapp.validator;

import com.xworkz.amazonapp.product.Product;

public class ProductValidator {

    Product product;
    public boolean validateProductInfo(Product product){
        boolean productValid = false;
        boolean productIdValid =false;
        boolean productNameValid = false;
        boolean brandValid = false;
       /* boolean modelNameValid = false;
        boolean colorValid = false;
        boolean priceValid = false;
        boolean itemWeightValid = false;*/

        if (product.getProductId() > 0){
            productIdValid = true;
        }
        else {
            System.out.println("Product id is not valid");
        }
        if (product.getProductName() != null && !product.getProductName().isEmpty()){
            productNameValid = true;
        }
        else {
            System.out.println("Product name is empty/null");
        }
        if (product.getBrand() != null && !product.getBrand().isEmpty()){
            brandValid = true;
        }
        else {
            System.out.println("Brand is empty/null");
        }
        /*if (product.getModelName() != null && !product.getModelName().isEmpty()){
            modelNameValid = true;
        }
        else {
            System.out.println("Model name is empty/null");
        }
        if (product.getColor() != null && !product.getColor().isEmpty()){
            colorValid = true;
        }
        else {
            System.out.println("Color is empty/null");
        }
        if (product.getPrice() > 0){
            priceValid = true;
        }
        else {
            System.out.println("Price is not valid");
        }
        if (product.getItemWeight() != null && !product.getItemWeight().isEmpty()){
            itemWeightValid = true;
        }
        else {
            System.out.println("Product item weight is empty/null");
        }*/
        if (productIdValid && productNameValid && brandValid ){ //&& modelNameValid && colorValid && priceValid && itemWeightValid){
            productValid = true;
        }
        return productValid;
    }
}
