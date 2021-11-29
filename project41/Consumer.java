package com.deloitte.training.produccerconsumer;

import java.util.List;

//This is a thread - Consumer task
public class Consumer implements Runnable {
    List<Integer> questionList = null;// -Questions in the queue/same list
    //shared in consumer and producer


    //Constructor
    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    //Behaviors
    public void asnwerQuestion() throws InterruptedException {
        // Lock the list with the synchronized key using questionList
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                System.out.println("No questions to answer... Waiting for producer to get Questions");
                questionList.wait();//This is now waiting to get questions, because it's empty
            }
        }
        synchronized(questionList) {
            Thread.sleep(5000);
            System.out.println("Answered question: " + questionList.remove(0));//0 because we are removing
            //the top question of the list
            questionList.notify();//notify that there is a question answered
        }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            try {
                asnwerQuestion();
            } catch (InterruptedException e) {

            }
        }



    }
}