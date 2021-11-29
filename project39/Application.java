package com.delloite.trainning.client;
import com.delloite.trainning.inventory.InventoryManager;


//This application is not thread safe, it has to be modified, instead
// of using Thread.sleep(2000), use .join();
public class Application {

    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();


        Thread inventoryTask = new Thread(new Runnable() {
            //an anonymous class method
            @Override
            public void run() {
                manager.populateSoldProducts();

            }


        });
        Thread displayTask = new Thread(new Runnable() {
            //an anonymous class method
            @Override
            public void run() {
                manager.displaySoldProducts();

            }


        });

        inventoryTask.start();
        //	Thread.sleep(2000);
        inventoryTask.join();// this will hold the program until inventoryTask.start();
        //finishes and then call displayTask.start();
        displayTask.start();

    }

}
