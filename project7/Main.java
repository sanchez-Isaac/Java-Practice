package java_basics;

public class Variables {

    public static void main(String[] args) {
        // Learning arrays

        int [] values = new int[100];  // the square brakets give the variable the array ability
        // and the new int[100] fixes how many elements can be stored
        //this is a fixed size data structure, once initialized,
        //the size cant change

        double [] valuess = new double[100]; //same for this array
        valuess [0] = 1000;
        valuess [1] = 2000;
        valuess [99] = 3000;

        System.out.println(valuess[1]);


        String [] words = new String[] {"My","Name","Is"}; //this is not size fixed, can change on execution
        System.out.println(words[2]);
    }

}
