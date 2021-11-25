package java_basics;

public class Earth {

    public static void main(String[] args) {
        // A simple OOP JAVA program - Class variables must be private
        // but this is just an example.
        Human isaac = new Human(); // new human object

        //populate the class fields
        isaac.age = 30;  //by calling isaac. you can assign values
        isaac.eyeColor = "brown";
        isaac.HeightInInches = 180;
        isaac.name = "isaac";
        isaac.speak();// calling speak to print what we submitted

        Human joe = new Human(); // new human object
        joe.eyeColor = "Green";
        joe.HeightInInches = 190;
        joe.name = "Joe Warachi";
        joe.speak();
    }

}package java_basics;

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
    public Human() {

    }
}

