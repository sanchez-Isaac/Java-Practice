package com.deloiite.academy.utils;

import java.util.concurrent.BlockingQueue;


//Consumer Answers Questions

public class Consumer implements Runnable {
    //Variables
    BlockingQueue<Integer> questionQueue;

    //Constructor
    public Consumer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }


    @Override
    public void run() {

        while(true) {//Run indefinitely
            try {
                Thread.sleep(1000);
                //take() takes the first item on the queue, it also removes it
                System.out.println("ANSWERED QUESTION " + questionQueue.take());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }

}
