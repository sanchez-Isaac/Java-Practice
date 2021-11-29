package com.deloitte.academy.threadpools;


//Tasks always implement Runnable - Threads
public class MessageProcessor implements Runnable{

    //Variables
    private int message;

    //Constructor
    public MessageProcessor(int message) {
        this.message = message;
    }
//Behaviors

    @Override
    public void run() { //This an abstract method that needs to be implemented

        System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message = " + message);
        respondToMessage();//Simulate thread sleep to simulate work
        System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message = " + message);
    }

    private void respondToMessage(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message " + message);
        }

    }

}
