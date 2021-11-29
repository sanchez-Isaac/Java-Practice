package com.deloitte.academy.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//ThreadPools and the Executor Service - DATABASES?

public class ThreadPoolDemo {

    public static void main(String[] args) {
        // An executer service manages the thread pool

        //Recycle threads once its done using them
        ExecutorService executor = Executors.newFixedThreadPool(2);// This limiter only allows
        // a certain limit of thread use
        // at the same time.
        // To submit tasks to the thread
        Runnable processor1 = new MessageProcessor(2);
        executor.execute(processor1);

        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);

        //Once all tasks are completed, we need to shutdown
        executor.shutdown();//rejects new task form being submitted
        //executor.shutdownNow();//Stops the execution without finioshing aall threads


        while (!executor.isTerminated()) {	//This holds the printing of the message
        }                                 //Submiited all tasks



		/*
		///This also holds the execution of the next line, just an option
		try {
			executor.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

        System.out.println("Submmited all tasks...");


    }
}
