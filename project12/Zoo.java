package java_basics;

public class Zoo {

    public static void main(String[] args) {
        // A simple OOP JAVA program pt2 - Class variables must be private
        // but this is just an example.

        //String aniType, String name, int age, int gender, String weight
        Animal animal1 = new Animal("Tiger", "Toño", 30, "Male", "200lb");
        Animal animal2 = new Animal("Elephant", "Melvin", 38, "Male", "600lb");
        Animal animal3 = new Animal("Panter", "Pancho", 20, "Male", "150lb");

        animal1.presentation();
        animal2.presentation();
        animal3.presentation();



    }

}
