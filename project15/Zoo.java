package java_basics;

public class Zoo {
    // a more in depth approach to OOP example - Abstract classes (More in the Animal class)
    public static void main(String[] args) {
        // OOP is a way of programming that is more organized
        // OOP splits the code in multiple files that make logical sense

        //String aniType, String name, int age, String gender, String weight
        Animal spar1 = new Sparrow("Sparrow", "fearrow", 5, "Female", "100 lb");
        Animal fish1 = new Fish("Fish", "Fishy", 5, "Male", "50 lb");
        moveAnimals(spar1);
        moveAnimals(fish1);
    }

    //This method uses polymorphism
    //All types of Animal Children can be passed to this method
    //This makes all programs dynamic
    public static void moveAnimals(Animal animal) { //This method can take all kinds of animals
        animal.move();
    }

}
