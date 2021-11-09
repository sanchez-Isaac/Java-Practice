package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Simple program
        double x = 3.1416;
        double y = 60.36;

        // compare two numbers and assign the max number to a new variable
        // The Math.max method does the work
        double z = Math.max(x,y);
        //print the result in the screen
        System.out.println("the Max value between "+ x +" and "+ y +" = "+z);

        // determine de absolute number and assign the value to a new variable
        // The Math.abs method does the work
        double g = -23;
        double t = Math.abs(g);
        //print the result in the screen
        System.out.println("the absolute value of "+ g +" is: "+ t);

        // determine de square root of a number and assign the value to a new variable
        // The Math.sqrt method does the work
        double s = Math.sqrt(y);
        //print the result in the screen
        System.out.println("the square root of "+ y +" is: "+ s);

        // round a number and assign the value to a new variable
        // The Math.sqrt method does the work
        double h = Math.round(y);
        double h2 = Math.ceil(y);
        //print the result in the screen
        System.out.println("the rounded down number of "+ y +" is: "+ h);
        System.out.println("and the rounded up number of "+ y +" is: "+ h2);

        System.out.println("");
        System.out.println("");
        System.out.println("A little project! - find the hypotenuse");

        double x1; // Line x
        double y1; //Line y
        double hypo; // Hypotenuse

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side x: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter Side y: ");
        y1 = scanner.nextDouble();

        hypo = Math.sqrt((x1*x1)+(y1*y1));
        System.out.println("The hypotenuse is: "+ hypo);
        scanner.close(); // always close the scanner

    }
}
