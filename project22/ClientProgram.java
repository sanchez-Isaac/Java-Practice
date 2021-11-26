package CLI;
//This excercice is to run JAVA application on the Command line
public class ClientProgram {

    public static void main(String[] args) {
        Multiplier mult = new Multiplier();
        int result = mult.multiply(2,3,4);
        System.out.println("Result of the multiplier");
        System.out.println(result);

        //ls - list all the files in the current directory
        //javac --nameOfTheFile.java-- Compiles the file
        //java --nameOfTheFile-- without the .class executes the program

    }

}
