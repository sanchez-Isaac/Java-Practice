package java_basics;

public class Zoo {
    // a more in depth approach to OOP example - Interfaces and abstract classes
    public static void main(String[] args) {
        // OOP is a way of programming that is more organized
        // OOP splits the code in multiple files that make logical sense

        //String aniType, String name, int age, String gender, String weight
        Chicken chick1 = new Chicken("Chicken", "Pollito", 5, "Female", "200 lb");
        chick1.presentation();
        chick1.fly();


        Sparrow spar1 = new Sparrow("Sparow", "Fearow", 1, "Male", "100 lb");
        spar1.presentation();
        spar1.fly();
    }
}
