package java_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    //Collections - handle multiple data elements
    // DATA STRUCTURES - Hashset and LinkedHashSet with Hashcode
    public static void main(String[] args) {

        //HashSet will delete the duplicate values,
        //but will not conserve the order
        System.out.println("HashSet: Used to maintain unique values, not in order <Integer>");
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(76);
        values.add(546);
        values.add(6);
        values.add(76);

        for(Integer value : values) {
            System.out.println(value); //before we even try to print, the HashSet will delete
        }                              // the duplicates in this case 76

        System.out.println("");
        System.out.println("");
        System.out.println("HashSet: Used to maintain unique values, not in order <String>");
        HashSet<String> valuess = new HashSet<String>();
        valuess.add("random");
        valuess.add("Zsss");
        valuess.add("random");
        valuess.add("Door");
        valuess.add("random");

        for(String value : valuess) {
            System.out.println(value); //before we even try to print, the HashSet will delete
        }                              // the duplicates in this case random

        System.out.println("");
        System.out.println("");

        System.out.println("LinkedHashSet: Used to maintain unique values in order of insertion");
        //LinkedHashSet - Will keep the order
        LinkedHashSet<String> val = new LinkedHashSet<String>();
        val.add("random");
        val.add("Zsss");
        val.add("random");
        val.add("Door");
        val.add("random");

        for(String valu : val) {
            System.out.println(valu);
        }
        System.out.println("");
        System.out.println("");

        System.out.println("HashSet: using Class Animal ");
        HashSet<Animal> animals = new HashSet<Animal>();

        //There are duplicates in the Animal Objects
        Animal animal1 = new Animal ("Dog", 12);//1
        Animal animal2 = new Animal ("Cat", 2);//1
        Animal animal3 = new Animal ("Bird", 1);
        Animal animal4 = new Animal ("Cat", 2);//2
        Animal animal5 = new Animal ("Frog", 9);
        Animal animal6 = new Animal ("Dog", 12);//2

        //This is a HashSet and it deletes duplicates
        //HashSet creates a hash to prevent duplicates
        //In this case the fields are the same but the Hash is different
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);

        //But it will print the values repeated but it cannot identify
        // the duplicated values
        for(Animal ani : animals) {
            System.out.println(ani);
        }
        System.out.println("");
        System.out.println("");

        //Compare objects with the equals modified in Animal.java
        //Field to field comparison
        System.out.println("Are animal1 and animal2 equal?: ");
        System.out.println(animal1.equals(animal6));
        System.out.println(" ");

        System.out.print("Hash code of animal1: "); //They are different hashes
        System.out.println(animal1.hashCode());
        System.out.print("Hash code of animal6: ");//if the  Aimal.java didnt have the hashCode()
        System.out.println(animal6.hashCode());  // Implemented, they would be different
        //The implementation makes them not duplicates

    }
}