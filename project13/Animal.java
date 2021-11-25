package java_basics;

public class Animal {

    String aniType;
    String name;
    int age;
    String gender;
    String weight;


    //Behaviors
    public void presentation() {
        System.out.println(name + " The animal is a "+ aniType);
        System.out.println(name + " is "+ age + " years old");
        System.out.println(name + " is a "+ gender);
        System.out.println(name + " weights "+ weight);
        System.out.println(" ");
    }
    public void eat() {
        System.out.println(name + " is eating...");
        System.out.println(" ");
    }
    public void sleep() {
        System.out.println(name + " is sleeping...");
        System.out.println(" ");
    }

    //Constructor - the constructor must have the same name as the class name
    //Eclipse helps you generate the constructor using fields
    public Animal(String aniType, String name, int age, String gender, String weight) {
        super();
        this.aniType = aniType;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }



}
