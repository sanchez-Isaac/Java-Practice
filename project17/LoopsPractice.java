package practice.loops;

public class LoopsPractice {

    public static void main(String[] args) {


        int counter = 0;
        /////////////////////While Loops practice/////////////////
        while(counter <= 100) {//This loop will continue until counter reaches 100
            System.out.println("Isaac: " + counter); //Print my name
            counter += 1; // counter +1
            if (counter == 50) {
                System.out.println("Wooahh, not too fast!..");
                break; // you can exit the loop prematurely with break
            }
        }


        System.out.println(" ");





        /****************************************************
         * A challenge given by the UDEMY course 24 Lecture 17
         * WHILE LOOPS - This is my solution
         ***************************************************/
        System.out.println("/////////////////CHALLENGE///////////////////////");
        String str = "We have a large inventory of this in our warehouse falling in "
                + "the category:apperal and sligthly "
                + "more in demand category:makeup along with the category:forniture and .... .";

        printCategories(str);

        /****************************************************
         * Extract all categories from the string argument
         * @param str
         ***************************************************/
    }
    public static void printCategories(String str) {
        int ni = 0; //counter to find ":"
        boolean findc = true;
        while (findc){

            int countChar = 0; //This counter will advance in the String text

            while (countChar <= str.length()) { // while the counter is less than the String length. do:
                int cat = str.indexOf("category:");//Find "category:" in the text

                ///////////THIS IS THE MOST IMPORTANT PART//////////

                int i = 0; // this is an inside counter for the inner while loop
                Boolean notSpace = true; // this will control the loop
                String newStr = ""; //This string will save the data temporally

                while (notSpace){ // The loop begins
                    newStr+= str.charAt(cat + 9+ i); //The newStr will save the string starting at position 9 after cat + the following positions of "i"
                    i++; // "i" will keep growing and saving each char in newStr
                    if(str.charAt(cat + 9 + i)== ' ') { // if "i" finds a blank space, the loop breaks
                        break;
                    }
                }
                /////////

                System.out.println(newStr); //print the new string, but
                str = str.substring(cat + 9);//continue using the original String
                countChar++; //keep updating the counter



                //This section is part of the very first While loop
                int findcVal = str.indexOf(':'); //This will continually look for a ":" in the original String and
                if(findcVal > 0) {
                    findc = true; // if if finds it, the first while loop will continue
                } else {
                    findc = false; // if it doesnt, then, the loop will stop by changing findc to false
                    break;        // and end the loop
                }
            }
        }
    }
}


