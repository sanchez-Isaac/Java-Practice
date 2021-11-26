package java_practice;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException { // throws FileNotFoundException lets us read
        // files

        for (int i = 0; i <= 3; i++) {
            Scanner input = new Scanner(System.in); // takes data from the user
            System.out.println("Enter some text: ");
            String enteredText = input.nextLine(); // prompts the user and saves into enteredText
            System.out.println(enteredText);
        }

        //////////////////TRY CATCH BLOCK////////////////////////
        /////////////////////////////////////////////////////////
        try { //TRy these instructions if there is no error
            File file = new File("Untitled 1.txt"); // import data from a text file
            Scanner input = new Scanner(file); // read the file with throws FileNotFoundException
            while (input.hasNextLine()) { // if the file still has data
                String line = input.nextLine();// save the data into the variable line
                System.out.println(line);
            }
            input.close(); //close the Scanner
        } catch (FileNotFoundException e) {// If the error is found, do this instead
            //e.printStackTrace();//this is not pretty
            System.out.println("file not found");//this is better
        }



        //We need to create an instance/object of MyFileUtil
        MyFileUtil myUtil = new MyFileUtil();
        try {// in case this method throws an exception, we sorround it
            // with a try catch
            System.out.println(myUtil.substract10FromLArgerNumber(12));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();//the exception will show with the message
            //sent from the method
        }
    }


}
