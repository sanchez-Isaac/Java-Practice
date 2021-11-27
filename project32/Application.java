package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    //How to grate Generic classes
    public static void main(String[] args) {

        Container <Integer, String> container = new Container<>(12, "Hello"); //The class Container its generic
        //it accepts 2 different types
        //with no complaints but!!!
        // It is not typeSafe!!!!!!!
        int val1 = container.getItem1(); //This is not complaining because the getItems is fully generic
        container.printItems();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //We are going to test the generic method
        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("First");
        mySet1.add("Second");
        mySet1.add("Third");
        mySet1.add("Fourth");
        Set<String> mySet2 = new HashSet<String>();
        mySet2.add("First");
        mySet2.add("Second");
        mySet2.add("Third");
        mySet2.add("Computer");
        //Pass the list varriables
        Set <String>ResultSet =union(mySet1, mySet2);//We need to specify the type of
        //data we are going to use, else
        //they will be objects without a type <String>

        //Iterate over the Set with iterator instead of a foreach
        Iterator <String> itr = ResultSet.iterator();//Use the <String> to avoid casting
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
	/*
	//This is a non-generic Set
	public static Set union(Set set1, Set set2) {
		Set result = new HashSet(set1);
		result.addAll(set2);
		return result;
	}
	*/

    //This is a completely generic Set
    public static <E> Set<E> union(Set <E> set1, Set <E> set2) {//We need to pass the generic <> brackets
        Set <E>result = new HashSet<>(set1);//here too
        result.addAll(set2);
        return result;
    }



}
