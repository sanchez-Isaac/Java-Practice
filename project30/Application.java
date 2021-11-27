package java_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    //Collections - handle multiple data elements
    // DATA STRUCTURES - HashMap, LinkedHashMap and TreeMap
    public static void main(String[] args) {
        // Maps are like a dictionary - they have 2 sections word/definition

        // in a map, every row of data is considered an entry
        // containing a key/datatype and a value/datatype
        System.out.println("HashMap:");
        HashMap<String, String> dictionary = new HashMap<String, String>();
        // HashMap doesn't keep the order of the items
        dictionary.put("Brave", "Disney movie Brave");
        dictionary.put("ToyStory", "Disney movie Toy Story");
        dictionary.put("Cars", "Disney movie Cars");
        dictionary.put("Jack", "Jack is not a disney movie");

        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));// This prints the definitions
        }

        // LinkedHashMap keeps the order of insertion
        System.out.println("");
        System.out.println("LinkedHashMap:");
        LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<String, String>();

        dictionary1.put("Brave", "Disney movie Brave");
        dictionary1.put("ToyStory", "Disney movie Toy Story");
        dictionary1.put("Cars", "Disney movie Cars");
        dictionary1.put("Jack", "Jack is not a disney movie");

        for (String word1 : dictionary1.keySet()) {
            System.out.println(word1);
            System.out.println(dictionary.get(word1));// This prints the definitions
        }

        System.out.println("");
        System.out.println("");
        // The following allows to print the key and set together
        for (Map.Entry<String, String> entry : dictionary1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());// This prints the definitions

        }

        //TreeMaps maintain the natural order of insertion alphabetical
        TreeMap<String, String> dictionary2 = new TreeMap<String, String>();
        dictionary2.put("Brave", "Disney movie Brave");
        dictionary2.put("ToyStory", "Disney movie Toy Story");
        dictionary2.put("Cars", "Disney movie Cars");
        dictionary2.put("Jack", "Jack is not a disney movie");
        dictionary2.put("Jack", "XXXXXXXXXXXXXX"); //Overwriting information, no duplicates

        System.out.println("");
        System.out.println("TreeMaps: ");
        // The following allows to print the key and set together
        for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());// This prints the definitions

        }

    }
}