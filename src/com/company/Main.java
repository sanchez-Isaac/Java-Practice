package com.company;
public class Main {
// Java program that passes parameters to another function with the use of a do while loop and
    //Switch statements

    /*******************************************************
     *Testing Clases, Encapsulation, Constructors
     * Main() - Just acting as the driver program
     *****************************************************/
    public static void main(String[] args) {
        studProfile studA = new studProfile("Isaac","Sanchez",2021,3.63,"Software Engineering");
        studProfile studB = new studProfile("Ramon","Escobar",2020,4.00,"Web Engineering");
        studProfile studC = new studProfile("Alan","Ramirez",2022,2.36,"Computer Science");


        System.out.println(studA.getFulldata());
        System.out.println(studB.getFulldata());
        System.out.println(studC.getFulldata());

    }
}