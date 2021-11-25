package java_basics;

public class Human {

    String name;
    int age;
    int HeightInInches;
    String eyeColor;

    //Behaviors
    public void speak() {
        System.out.println("Hello, my name is "+ name);
        System.out.println("I am "+ HeightInInches + " cm tall");
        System.out.println("I am "+ age + " years old");
        System.out.println("My eye color is "+ eyeColor);
    }
    public void eat() {System.out.println("Eating...");}
    public void walk() {System.out.println("walking...");}
    public void work() {System.out.println("working...");}

    //Constructor - the constructor must have the same name as the class name
    //Eclipse helps you generate the constructor using fields
    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.name = name; //this. keyword its a variable,
        //points to the current object, this particular instance
        this.age = age;
        this.HeightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }



}
