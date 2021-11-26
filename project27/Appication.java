package java_practice;

import java.util.ArrayList;

public class Application {
    //Collections - handle multiple data elements
    // DATA STRUCTURES
    public static void main(String[] args) {
        // LOOPIN THE DATA STRUCTURE
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Zebra");

        // For loop
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println(" ");
        System.out.println(" ");
        // For each loop
        for (String value : animals) {// Needs datatype to be traversed, in this case <String>
            // this variable will store temporally the data collection
            System.out.println(value);// this will print each value of the collection
        }
        System.out.println(" ");
        System.out.println(" ");

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // This is an object Datatype
        // not a primitive DT
        vehicles.add(new Vehicle("Mazda", "3", 20000, false)); // This initializes a new object and
        // Stores it in the ArrayList

        // You can also create objects normally and then add them to the ArrayList
        Vehicle vehicle2 = new Vehicle("Ford", "Fusion", 40000, false);
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Chevrolett", "Camaro", 90000, false));
        vehicles.add(new Vehicle("Fiat", "palio", 15000, false));
        vehicles.add(new Vehicle("KIA", "Forte", 29000, false));
        vehicles.add(new Vehicle("Subaru", "Inpala", 26000, true));

        // CHALLENGE//
        // Loop the ArrayList to display the items

        for (Vehicle vehic : vehicles) {// Needs datatype to be traversed, in this case <String>
            // this variable will store temporally the data collection
            System.out.println(vehic.getMake() +" - "+ vehic.getModle()+" $"+ vehic.getPrice() );// this will print each value of the collection
        }
        System.out.println(" ");
        System.out.println(" ");

        ////Teacher Approach////
        for (Vehicle vehic : vehicles) {// Needs datatype to be traversed, in this case <String>
            // this variable will store temporally the data collection
            System.out.println(vehic);// this will print each value of the collection
        }
        System.out.println(" ");
        System.out.println(" ");


    }
}