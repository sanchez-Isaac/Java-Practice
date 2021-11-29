package com.deloitte.training.produccerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> questionList = new ArrayList<>();

        Thread t1 = new Thread(new Producer(questionList));//Populates question list
        Thread t2 = new Thread(new Consumer(questionList));//REmove questions from the list


        t1.start();
        t2.start();
    }

}
