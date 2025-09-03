package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;


public class Amazon {
    Product[] products = new Product[19];
    int index;

    public void addProduct(Product product) {
        boolean isProductAdded = false;
        if (product != null) {
            products[index++] = product;
            isProductAdded = true;
        } else {
            System.out.println("Invalid Product");
        }
    }

    public void getAllProducts() {
        System.out.println("List of products are " + products.length);
        for (Product product : products) {
            System.out.println("Product id " + product.getProductId());
            System.out.println("Product Name " + product.getProductName());
            System.out.println("Product Brand " + product.getBrand());
        }
    }

}
    /*Product product;
    public boolean addProduct(Product product){
        boolean isProductAdded = false;
        boolean isProductInfo = false;

        ProductValidator productValidator = new ProductValidator();
        isProductInfo = productValidator.validateProductInfo(product);

        if (isProductInfo){
            this.product = product;
            isProductAdded = true;
        }
        return isProductAdded;
    }
    public boolean updateProductPrice(double price) {
        boolean isPriceUpdate = false;
        if (price > 0) {
            product.setPrice(price);
            isPriceUpdate = true;
        }
        return isPriceUpdate;
    }
    public void getProductInfo(){
        System.out.println("Product id: "+product.getProductId());
        System.out.println("Product name: "+product.getProductName());
        System.out.println("Product brand: "+product.getBrand());
        System.out.println("Product model name: "+product.getModelName());
        System.out.println("Product color: "+product.getColor());
        System.out.println("Product price: "+product.getPrice());
        System.out.println("Product item weight: "+product.getItemWeight());
    }

    }*/

