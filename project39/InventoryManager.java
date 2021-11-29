package com.delloite.trainning.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    //Lists to hold data
    List<Product> soldProductLists = new CopyOnWriteArrayList<Product>();
    List<Product> purchasedProductLists = new ArrayList<Product>();

    public void populateSoldProducts() {
        for(int i = 0; i < 1000; i++){
            Product prod = new Product(i, "test_product_" + i);
            soldProductLists.add(prod);
            System.out.println("ADDED: " + prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }



    public void displaySoldProducts() {
        for(Product product : soldProductLists) {
            System.out.println("Printing the Sold: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}






