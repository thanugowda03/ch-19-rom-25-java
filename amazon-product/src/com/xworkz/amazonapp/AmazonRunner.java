package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        Product product1 = new Product();
        product1.setProductId(1);
        product1.setProductName("Laptop");
        product1.setBrand("HP");

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setProductName("Laptop");
        product2.setBrand("HP");

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setProductName("Laptop");
        product3.setBrand("HP");

        Product product4 = new Product();
        product4.setProductId(4);
        product4.setProductName("Laptop");
        product4.setBrand("HP");

        Product product5= new Product();
        product5.setProductId(5);
        product5.setProductName("Laptop");
        product5.setBrand("HP");

        Product product6 = new Product();
        product6.setProductId(6);
        product6.setProductName("Laptop");
        product6.setBrand("HP");

        Product product7 = new Product();
        product7.setProductId(7);
        product7.setProductName("Laptop");
        product7.setBrand("HP");

        Product product8 = new Product();
        product8.setProductId(8);
        product8.setProductName("Laptop");
        product8.setBrand("HP");

        Product product9 = new Product();
        product9.setProductId(9);
        product9.setProductName("Laptop");
        product9.setBrand("HP");

        Product product10 = new Product();
        product10.setProductId(10);
        product10.setProductName("Laptop");
        product10.setBrand("HP");


        Product product11 = new Product();
        product11.setProductId(11);
        product11.setProductName("Laptop");
        product11.setBrand("HP");

        Product product12 = new Product();
        product12.setProductId(12);
        product12.setProductName("Laptop");
        product12.setBrand("HP");

        Product product13 = new Product();
        product13.setProductId(13);
        product13.setProductName("Laptop");
        product13.setBrand("HP");

        Product product14 = new Product();
        product14.setProductId(14);
        product14.setProductName("Laptop");
        product14.setBrand("HP");

        Product product15 = new Product();
        product15.setProductId(15);
        product15.setProductName("Laptop");
        product15.setBrand("HP");

        Product product16 = new Product();
        product16.setProductId(16);
        product16.setProductName("Laptop");
        product16.setBrand("HP");

        Product product17 = new Product();
        product17.setProductId(17);
        product17.setProductName("Laptop");
        product17.setBrand("HP");

        Product product18 = new Product();
        product18.setProductId(18);
        product18.setProductName("Laptop");
        product18.setBrand("HP");

        Product product19 = new Product();
        product19.setProductId(19);
        product19.setProductName("Laptop");
        product19.setBrand("HP");

        Amazon amazon=new Amazon();
        amazon.addProduct(product1);
        amazon.addProduct(product2);
        amazon.addProduct(product3);
        amazon.addProduct(product4);
        amazon.addProduct(product5);
        amazon.addProduct(product6);
        amazon.addProduct(product7);
        amazon.addProduct(product8);
        amazon.addProduct(product9);
        amazon.addProduct(product10);
        amazon.addProduct(product11);
        amazon.addProduct(product12);
        amazon.addProduct(product13);
        amazon.addProduct(product14);
        amazon.addProduct(product15);
        amazon.addProduct(product16);
        amazon.addProduct(product17);
        amazon.addProduct(product18);
        amazon.addProduct(product19);
        amazon.getAllProducts();


       /* product.setModelName("HP laptop");
        product.setColor("Silver");
        product.setPrice(42990.00);
        product.setItemWeight("1700 grams");

        Amazon amazon = new Amazon();
        boolean addProduct = amazon.addProduct(product);

        if (addProduct){
            amazon.getProductInfo();
        }
        amazon.updateProductPrice(7889.00);
        amazon.getProductInfo();*/
    }
}
