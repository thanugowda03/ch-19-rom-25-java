package com.xworkz.abstractionapp.bucket;

import com.xworkz.abstractionapp.bucket.impl.PlasticBucketImpl;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket=new PlasticBucketImpl();
        bucket.brand();
        bucket.materialType();
        bucket.price();
    }
}
