package threading;

public class Sequence {
    private int value = 0;


	/*
	 *
	public int getNext() {
		 //this code is made to maintain a sequence, but its not thread safe
		value++;
		return value;


		//This is the way to make it thread safe
		synchronized (this) {//This specifies the object

			//synchronized makes sure that this is not going to pause and it will let
			//another thread to come in and use it
			value = value +1;
			return value;

			//This is called lock
			}
		*/

    public synchronized int getNext() {
        //This is a simpler implementation
        value = value +1;
        return value;
    }



}
