package threading;

import java.util.Iterator;

//Set name of threads, this is my approach
public class Application {//This is the main thread

    public static void main(String args[]) {

        System.out.println("Starting Thread 1");
        Task taskRunner = new Task("Thread 1");
        taskRunner.start();

        System.out.println("Starting Thread 2");
        Task taskRunner2 = new Task("Thread 2");
        taskRunner2.start();
    }
}

//Starts a second thread
class Task extends Thread {//Thread is from the runnable interface
    //Variable name for the thread
    String name;

    //Constructor
    public Task(String name) {
        this.name = name;
    }


    public void run() { //This is a abstract method, meaning that it must
        // be signed/implemented
        Thread.currentThread().setName(this.name); //sets the name of the thread

        for (int i = 0; i < 1000; i++) {
            //The Thread.currentThread().getName() will print the thread that is printing
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}






















