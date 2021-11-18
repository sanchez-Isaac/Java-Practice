package com.company;
import java.util.Scanner;



public class Main {
// Java program that passes parameters to another function with the use of a do while loop and
    //Switch statements

    /*******************************************************
     * The calcTotalPrice Method will calculate the total
     * of the food consuption of the client by adding
     * the prices of the food and then multiply by .10 to
     * get the tips.
     *****************************************************/
    public static void calcTotalPrice(double total){
        System.out.println("$"+ String.format("%.2f", total)); //display the total

        //Calculate the tips
        double tip = total * 0.10; // Calculate the 10% for the tips
        System.out.println("10% of tips = $" + String.format("%.2f", tip)); //display the total
        System.out.println("Grand total of = $" + String.format("%.2f", tip + total)); //display the total

    }

    /***********************************************************
     * The main will be the driver
     * Will display food options to the user and prompt the
     * user, next it will store the expenses until the user
     * selects stop.
     * Then the total will be sent to the calcTotalPrice method
     *********************************************************/
    public static void main(String[] args) {

        boolean cont = true; // the conditional to keep the loop running
        double total = 0; // will store the food expenses
        Scanner scanner = new Scanner(System.in); // the input preparation

        //keep running the loop until cont becomes false
        do {
            // A simple menu for clients use
            System.out.println("What would ypu like to eat? ");
            System.out.println("1. Spaguetti"); // cost $10.00
            System.out.println("2. Hamburger");// cost $20.00
            System.out.println("3. Tuna Sandwich");// cost $6.00
            System.out.println("4. Soda");// cost $5.00
            System.out.println("5. Stop");// stop change cont to true
            System.out.println();

            //selection input
            int select = scanner.nextInt();

            // Switch statements begin
            switch (select) {
                case 1:
                    total += 10.63;
                    System.out.println("You Got Spaguetti, Your current total is: $" + String.format("%.2f", total));
                    break;
                case 2:
                    total += 20.10;
                    System.out.println("You Got a Hamburger, Your current total is: $" + String.format("%.2f", total));
                    break;
                case 3:
                    total += 6.30;
                    System.out.println("You Got a Tuna Sandwich, Your current total is: $" + String.format("%.2f", total));
                    break;
                case 4:
                    total += 10.10;
                    System.out.println("You Got Soda, Your current total is: $" + String.format("%.2f", total));
                    break;
                case 5:
                    System.out.println("Your order has finished, Your current total is: ");
                    cont = false; //Stop the loop
                    break;
            }
        } while(cont);

        calcTotalPrice(total); // pass the total price to the next method

    }
}