package com.company;
import java.util.Scanner;

public class Main {
    // A while loop program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true; // will control the while loop
        int timer = 5; //Time remaining of a "song"

        while(repeat){ //While loop starts
            System.out.println("Playing a song, seconds left: "); //In the loop, this will be printed along
            //with the time remaining
            if (timer > 0) { // If statement to check for time left
                System.out.println(timer); //prints the time
                timer--; //reduce timer on each loop until the next IF applies
                try{
                    Thread.sleep(1000); //Reduce the print time to simulate a timer
                }
                catch(Exception e)
                {}
                System.out.print("\f"); // clear the screen
            }
            if(timer <= 0){ //scoop to ask the user once the timer reaches 0 or less
                System.out.println("Would you like to repeat the song? : "); //prompt the user
                String userInput = input.next(); // variable to store the response

                //multiple options to say No to the repeat
                if (userInput.equals("No") || userInput.equals("no") || userInput.equals("n") || userInput.equals("N")){
                    repeat = false; // if the user types No, then we will be kicked out of the while loop
                }
                else{
                    repeat = true; // if the user types other than No, then the loop will continue
                    timer = 5; // the timer gets another 5 seconds and re prompts the user
                }
            }
        }
        System.out.println("Playing new song"); // if we get out of the prompt, then we will be shown a new song.
    }
}
