package java_basics;

public class Bird extends Animal {// Inheritance - Animal is the super/parent class

    //The bird Class must implement a constructor similar to Animal, with the same variables
    public Bird(String aniType, String name, int age, String gender, String weight) {
        super(aniType, name, age, gender, weight);
        // TODO Auto-generated constructor stub
    }

    public void fly() { //An exclusive method only accessible by making
        // bird objects in main
        System.out.println(name + " is flying");
    }

    //Abstract move() method from Animal
    public void move() {
        System.out.println("Moving wings... they use them to fly");

    }

}
