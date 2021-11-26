package CLI;
//This excercice is to create JAR files
public class ClientProgram {

    public static void main(String[] args) {
        Multiplier mult = new Multiplier();
        int result = mult.multiply(2,3,4);
        System.out.println("Result of the multiplier");
        System.out.println(result);
        //cd - change directory
        //pwd - print working directory
        //clear - clears the command line screen
        //ls - list all the files in the current directory
        //javac --nameOfTheFile.java-- Compiles the file
        //java --nameOfTheFile-- without the .class executes the program
        //java -jar nameOfTheFile.jar -- excecutes jar files on cli
        //jar -tvr nameOfTheFile.jar-- will show the contents of the jar
        //jar -xvf nameOfTheFile.jar -- extract all the files on the jar
        //cat nameOfTheFile.java --shows the code of the file


        //To create jars, click on the main project
        //go to export
        //Select Runnable Jar or jar file if you want people to use the code
        //This is for Eclipse


        //To create Jars on the CLI
        //we need to create a manifest file
        //Manifiest example:
        // Main-class: ExampleProgram
        // leave a space here


        //jar -cvfm nameOfTheFile.jar manifest.mf *.class -- this creates a jar file on the cli

    }

}
