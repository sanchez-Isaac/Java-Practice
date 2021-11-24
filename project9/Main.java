package java_basics;

public class LearningMethods {
    //We will practice methods

    public static void main(String[] args) {
        System.out.println("rgergerger"); //the text in the quotes is called
        // argument

        // MyUtils class, a separate class from main, can be evoked using the dot
        // operator, just like system.out.....
        MyUtils.printSomeJunk(); // our own method being called
        MyUtils.printSomeJunk2("some text"); // method that receives string values
        MyUtils.printSomeJunk2(24); // method that receives int values (This is something i didn't know about)


        MyUtils.sum2Nums(32,45); //call of a sum method in the MyUtils class

        int values = MyUtils.add10(99)+1000-90; // assign the value to a variable to
        System.out.println(values);     // be displayed on the console


        String val= MyUtils.printSomeJunk("Return this: "); // our own method being called
        System.out.println(val);
    }


}
