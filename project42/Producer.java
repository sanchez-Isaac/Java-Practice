package com.deloiite.academy.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Consumer Creates Questions
public class Producer implements Runnable {

    // Variables
    int questionNo;
    BlockingQueue<Integer> questionQueue;

    // Constructor
    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {

        // This is 100% thread safe
        while (true) { //This will run indefinetely
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Got new Question: " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
            }
        }

    }

}
