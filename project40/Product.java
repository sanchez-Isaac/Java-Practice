package com.delloite.trainning.inventory;

public class Product {

    int id;
    String name;

    //Constructor
    public Product(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " | name: " + name ;
    }




}
