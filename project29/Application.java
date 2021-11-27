package java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    //Collections - handle multiple data elements
    // DATA STRUCTURES - Hashset and LinkedHashSet with Hashcode
    public static void main(String[] args) {

        HashSet<Integer> HashSet = new HashSet<Integer>();
        HashSet.add(12);
        HashSet.add(14);
        HashSet.add(45);
        HashSet.add(15);
        HashSet.add(72);
        HashSet.add(136);
        HashSet.add(7);
        HashSet.add(10);


        ArrayList<Integer> myList = new ArrayList<Integer>(HashSet);//This ArrayList will take
        //HashSet as an argument
        Collections.sort(myList);//This is going to sort the list in myList Smallest to largest
        System.out.println(myList);


        HashSet<String> HashSet2 = new HashSet<String>();
        HashSet2.add("Dog");
        HashSet2.add("Adrian");
        HashSet2.add("Antonio");
        HashSet2.add("Cat");
        HashSet2.add("Omar");
        HashSet2.add("Juan");
        HashSet2.add("Carlos");
        HashSet2.add("Elephant");


        ArrayList<String> myList2 = new ArrayList<String>(HashSet2);//This ArrayList will take
        //HashSet2 as an argument
        Collections.sort(myList2);//This is going to sort the list in myList2 Alphabetically
        System.out.println(myList2);
        System.out.println("");
        System.out.println("");



        HashSet<Employee> HashSet3 = new HashSet<Employee>();
        HashSet3.add(new Employee ("Mike", 3500, "Accounting"));
        HashSet3.add(new Employee ("Sarai", 5500, "Accounting"));
        HashSet3.add(new Employee ("Jorge", 3500, "IT"));
        HashSet3.add(new Employee ("Mariana", 2500, "HR"));

        ArrayList<Employee> myList3 = new ArrayList<Employee>(HashSet3);

        Collections.sort(myList3);
        System.out.println(myList3);

    }
}