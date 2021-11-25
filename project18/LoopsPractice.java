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

        printCategories1(str); // My solution
        printCategories(str); // Course Ssolution

        /****************************************************
         * Extract all categories from the string argument
         * @param str
         ***************************************************/
    }
    public static void printCategories1(String str) {
        System.out.println(" ");
        System.out.println("My Solution: ");
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

    public static void printCategories(String str) {
        System.out.println(" ");
        System.out.println("Teacher Solution: ");
        int i = 0; // index increment
        while(true) {
            int found = str.indexOf("category:", i);//store the index pos of "category:"
            //("category:", i) I didnt know this, that an int could store
            // values like this

            if(found == -1){break;} //-1 is equal to: no or negative, meaning that if category: is not found
            // the loop will break
            int start = found +9;//The starting position or index of Category:
            //this will return the string without "Category:"
            int end = str.indexOf(" ", start); // This is the end of the category string.

            System.out.println(str.subSequence(start, end));// print
            i = end+1; // loop control, The loop will continue until category: is not found
        }

    }

}


