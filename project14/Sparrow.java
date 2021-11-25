package java_basics;

public class Sparrow  extends Bird implements Flyable{

    public Sparrow(String aniType, String name, int age, String gender, String weight) {
        super(aniType, name, age, gender, weight);
        // TODO Auto-generated constructor stub
    }

    //Override
    public void fly() {
        System.out.println("Sparrow flying high");
        System.out.println(" ");

    }

}
