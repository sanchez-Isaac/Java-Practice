package com.deloiite.academy.utils;

//concurrent utilities make multi-threading much easier
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Will implement ArrayBlockingQueue DATA STRUCTURE
public class Application {

    public static void main(String[] args) {
        BlockingQueue<Integer> QuestionQueue = new ArrayBlockingQueue<>(5);
        //BlockingQueue Expects a capacity immediately without been defined by us.

        //Instantiate objects to run the program
        Thread t1 = new Thread(new Producer(QuestionQueue));// pass the QuestionQueue
        Thread t2 = new Thread(new Producer(QuestionQueue));// pass the QuestionQueue
        //Start the threads
        t1.start();
        t2.start();






    }

}
