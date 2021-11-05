package com.company;
import javax.swing.JOptionPane; //This allows the GUI input to be called
public class Main {

    public static void main(String[] args) {
	// A simple Java GUI input

        //creates a variable name and asks for the input
        String name = JOptionPane.showInputDialog("Enter your Name");
        //Displays the input
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //creates a variable age and asks for the input
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //Displays the input
        JOptionPane.showMessageDialog(null, "You are " + age + " Year old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        //Displays the input
        JOptionPane.showMessageDialog(null, "You are " + height +" tall");

        String ccn = JOptionPane.showInputDialog("Enter your Credit Card Number");
        //Displays the input
        JOptionPane.showMessageDialog(null, "Your Credit Card Number is: \n" + ccn);

        JOptionPane.showMessageDialog(null,"This is your info: \n"
                                     + "your name is: " + name + "\n"
                                     + "your age is: " + age+ "\n"
                                     + "your height is: " + height + "\n"
                                     + "your CCN is: " + ccn);

        JOptionPane.showMessageDialog(null,"You are not supposed to give out your CCN " + name + "!!! 😑😑😑 \n");
    }
}
