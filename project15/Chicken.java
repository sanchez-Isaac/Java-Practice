package java_basics;

public class Chicken extends Bird{

    public Chicken(String aniType, String name, int age, String gender, String weight) {
        super(aniType, name, age, gender, weight);
        // TODO Auto-generated constructor stub
    }

    //The bird class has a fly() method, this re-implementation is called
    //Overriding, we are overriding the method fly() in the bird class
    public void fly() { //overriding a method makes it more specific to the class Chicken
        System.out.println("A chicken cannot fly!");
        System.out.println(" ");
    }

}
