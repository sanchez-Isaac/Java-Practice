package com.company;
import java.util.Scanner;

public class Main {
// A simple IF program test
    public static void main(String[] args) {

        //The program will prompt the user for a number
        System.out.print("Pic a number: ");
        Scanner scanner = new Scanner(System.in);
        //The user will input a number
        int inputtedNum = scanner.nextInt();

        //this is the logic
        if(inputtedNum < 0){
            System.out.println("try a number between 1-10");
        } else if(inputtedNum <= 0) {
            System.out.println("0 is not an option, try again");
        } else if(inputtedNum <= 1) {
            System.out.println(inputtedNum + " is a better option, but still low");
        } else if(inputtedNum <= 3){
            System.out.println(inputtedNum +" is a better option, but still low");
        } else if(inputtedNum <= 5){
            System.out.println(inputtedNum +" is perfect! try to go higher");
        } else if(inputtedNum <= 7) {
            System.out.println(inputtedNum + " it's fine but try to go higher");
        } else if(inputtedNum <= 9) {
            System.out.println(inputtedNum + "is great. keep going, you are almost there!");
        } else if(inputtedNum == 10) {
            System.out.println(inputtedNum + " Maximum reached!");
        }else if(inputtedNum > 10) {
            System.out.println(inputtedNum + " is out of bounds");
        } else{
            System.out.println("Try again");
        }


    }
}
