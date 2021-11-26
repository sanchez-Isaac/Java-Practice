package java_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args)  { //Try Catch with resources example
        File file = new File("Untitled 1.txt");

        try(FileReader fileReader = new FileReader(file); //This is a try catch with resources
            BufferedReader bufferedReader = new BufferedReader(fileReader);){// it auto closes the in-streams

            String line = bufferedReader.readLine(); //The buffer will be saved in String line
            while(line != null) { //If the line is not null then the buffer is stored line by line
                System.out.println(line);// print the new variable data
                line = bufferedReader.readLine(); //the text will update and continue
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");// if an exception is found, catch it and print
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());// if an exception is found, catch it and print
        }
    }
}