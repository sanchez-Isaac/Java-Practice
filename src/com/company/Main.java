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
    }
}
