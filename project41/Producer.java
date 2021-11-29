package com.deloitte.training.produccerconsumer;

import java.util.List;

//This is a thread - Producer task
public class Producer implements Runnable {
    List<Integer> questionList = null;// -Questions in the queue
    final int LIMIT = 5;// this is the limit of questions until they are answered
    private int questionNo;// current question

    //Constructor
    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    //Behaviors
    public void readQuestion(int questionNo) throws InterruptedException {
        // Lock the list with the synchronized key using questionList
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Questions have piled up.... wait for answers");
                questionList.wait();// the synchronized lock has been put on wait, we are giving
                // temporal control to other thread that wants to access this
                // questionList
            }
        }
        synchronized(questionList) {
            System.out.println("New Question: " + questionNo);
            questionList.add(questionNo);
            Thread.sleep(10);
            questionList.notify();//These functions can only be used inside a synchronized lock
        }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            try {
                readQuestion(questionNo++);
            } catch (InterruptedException e) {

            }
        }



    }
}