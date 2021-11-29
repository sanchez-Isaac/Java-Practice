package threading;

import java.util.Iterator;

//Thread Safety using Synchronization
public class Application {
    //2 threads accessing the same variable information
    public static void main(String args[]) {
        Sequence sequence = new Sequence();
        Worker worker1 = new Worker(sequence);
        Worker worker2 = new Worker(sequence);

        //Start the threads
        worker1.start();
        worker2.start();
        //

    }
}

//This is another thread
class Worker extends Thread {

    //Variable
    Sequence sequence = null;

    //Constructor
    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    //Override run method - Always in multi-threading
    public void run() {
        for(int i = 0; i < 100; i++) {
            //getNext in not threaded safe originally
            System.out.println( Thread.currentThread().getName() + " Got value: " + sequence.getNext());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



