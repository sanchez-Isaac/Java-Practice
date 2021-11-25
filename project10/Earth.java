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

}
