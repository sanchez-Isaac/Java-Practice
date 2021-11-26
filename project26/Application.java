package java_practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    //Collections - handle multiple data elements
    //DATA STRUCTURES
    public static void main(String[] args)  {

        //This type of Data structure allows any datatype to be stored in the arrayList
        ArrayList words = new ArrayList();//This is a resizeable array

        words.add("Hola0");//This is a String item
        words.add("Hola1");//This is a String item
        words.add("Hola2");//This is a String item
        words.add("Hola3");//This is a String item
        words.add("Hola4");//This is a String item
        words.add("Hola5");//This is a String item
        words.add("Hola6");//This is a String item
        words.add(1);//This is an integer item
        words.add(3);//This is an integer item
        words.add(5);//This is an integer item
        words.add(7.36);//This is an Double item
        words.add("h");//This is a char item
        words.remove(1);//We remove data according to the index position
        words.remove(3);//We remove data according to the index position
        words.remove(5);//We remove data according to the index position


        //Display data of the ArrayList
        //words.get returns an Object.class not a specific datatype

        String item1 = (String) words.get(0);//(String) cast data into a type
        Object item2 = words.get(0); //Or you can create an object to store
        //the data but it wont be usable
        System.out.println(item1);
        //This Structure is not type safety ready, it has to be changed into the
        //Following: JAVA 5 GENERIC COLLECTIONS

        ArrayList<String> words2 = new ArrayList<String>();//This is a resizeable array
        //This ArrayList only accepts String datatypes
        // The use of <String> is called template parameterization

        words2.add("Hola0");//This is a String item
        words2.add("Hola1");//This is a String item
        words2.add("Hola2");//This is a String item
        words2.add("Hola3");//This is a String item
        words2.add("Hola4");//This is a String item
        words2.add("Hola5");//This is a String item
        words2.add("Hola6");//This is a String item/



        //LINKED LIST DATA STRUCTURE
        //LinkedList<int> numbers = new LinkedList<int>();// Only complex datatypes can
        //be used on these templates not
        //primitives

        //Linked lists use node objects
        LinkedList<Integer> numbers  = new LinkedList<Integer>();
        LinkedList<Float>   floats = new LinkedList  <Float>();
        LinkedList<Double>  doubles = new LinkedList <Double>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        floats.add((float) 100.23);
        floats.add((float) 14.23);
        floats.add((float) 11.23);
        doubles.add(5454.5);
        doubles.add(324.5);
        doubles.add(65.5);

        System.out.println("LinkedList<Integer> numbers  = new LinkedList<Integer>(); ");

        for(int number : numbers) {
            System.out.println(numbers);
        }
        System.out.println("");
        System.out.println("LinkedList<Float>   floats = new LinkedList  <Float>(); ");

        for(float floa : floats) {
            System.out.println(floa);
        }
        System.out.println("");
        System.out.println("LinkedList<Double>  doubles = new LinkedList <Double>(); ");

        for(double doubl : doubles) {
            System.out.println(doubl);
        }
        System.out.println("");

    }
}