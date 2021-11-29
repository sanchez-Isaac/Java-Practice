package threading;

import java.util.Iterator;

//Start a thread
public class Application {//This is the main thread

    public static void main(String args[]) {
        System.out.println("Hello there");

        Task taskRunner = new Task();
        taskRunner.start();// This is a multi-threaded execution program
        //This will not wait for one code to finish, it will execute
        taskRunner.start(); //Starting a second thread of an already started instance its ilegal
        Task taskRunner2 = new Task();
        taskRunner2.start(); // this is legal
    }
}

//Starts a second thread
class Task extends Thread {//Thread is from the runnable interface

    public void run() { //This is a abstract method, meaning that it must
        // be signed/implemented
        for (int i = 0; i < 1000; i++) {

            System.out.println("number: " + i);
        }
    }
}






















