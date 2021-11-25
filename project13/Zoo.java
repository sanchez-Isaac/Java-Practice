package java_basics;

public class Zoo {
    // a more in depth approach to OOP example - Inheritance
    public static void main(String[] args) {
        // OOP is a way of programming that is more organized
        // OOP splits the code in multiple files that make logical sense

        //String aniType, String name, int age, String gender, String weight
        Bird bird1 = new Bird("Petirojo", "Perry", 2, "Female", "5 lb");
        bird1.presentation();
        bird1.sleep();
        bird1.eat();

        bird1.fly();

        Fish fish1 = new Fish("Golden", "Gordi", 1, "Female", "2 lb");
        fish1.presentation();
        fish1.sleep();
        fish1.eat();

        fish1.breathUW();
    }

}
