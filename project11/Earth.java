package java_basics;

public class Earth {

    public static void main(String[] args) {
        // A simple OOP JAVA program pt2 - Class variables must be private
        // but this is just an example.

        /*String name, int age, int heightInInches, String eyeColor*/
        Human human1 = new Human("Isaac",30, 180, "Brown");
        Human human2 = new Human("Daniel",17, 180, "Green");
        Human human3 = new Human("Joe",25, 170, "Blue");
        human1.speak();
        human2.speak();
        human3.speak();

    }

}
