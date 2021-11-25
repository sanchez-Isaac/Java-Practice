package java_basics;

public class Fish extends Animal{

    public Fish(String aniType, String name, int age, String gender, String weight) {
        super(aniType, name, age, gender, weight);
        // TODO Auto-generated constructor stub
    }
    public void breathUW() {//An exclusive method only accessible by making
        // Fish objects in main
        System.out.println(name + " is breathing Underwater");
    }

    //Abstract move() method from Animal
    public void move() {
        System.out.println("The fish is swimming... they can only swim");

    }

}
