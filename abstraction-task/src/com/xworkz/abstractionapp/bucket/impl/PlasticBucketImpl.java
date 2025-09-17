package com.xworkz.abstractionapp.bucket.impl;

import com.xworkz.abstractionapp.bucket.Bucket;

public class PlasticBucketImpl implements Bucket {
    @Override
    public void materialType() {
        System.out.println("Bucket material type is plastic");
    }

    @Override
    public void brand() {
        System.out.println("Bucket brand name Houssy");

    }

    @Override
    public void price() {
        System.out.println("Price of the bucket is 250Rs");

    }
}
