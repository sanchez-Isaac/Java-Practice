package practice.loops;

import java.util.Iterator;

public class LoopsPractice {

    public static void main(String[] args) {
        //FOR LOOPS
        String name = "ISAAC SANCHEZ bla bhal blah";

        for(int i = 0; i < 100; i++) {
            System.out.println("i: " + i);
        }
        for(int i = 0; i < name.length(); i++) { //The .length() needs to use the "<" not the <=, else use name.length()-1
            System.out.println("char: "+ name.charAt(i));
        }
        /////Challenge//////
        System.out.println("/////Challenge 1//////");
        for(int i = name.length()-1; i >= 0; i--) {
            System.out.println("char: "+ name.charAt(i));
        }

        /////Challenge//////
        System.out.println("/////Challenge 2//////");
        for(int i = 0; i  <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }


        }




    }
}


