package java_basics;

public class StringsPractice {

    public static void main(String[] args) {


        String str = "Hola como estas, espero no del todo mal";

        //Example 1
        System.out.println("//////Example 1//////");
        String extractdStr = str.substring(2);
        System.out.println(extractdStr);
        System.out.println(" ");


        //Example 2
        System.out.println("//////Example 2//////");
        String extractdStr2 = str.substring(2,6);
        System.out.println(extractdStr2);
        System.out.println(" ");

        //Example 3
        System.out.println("//////Example 3//////");
        String extractdStr3 = str.substring(8,20);
        System.out.println(extractdStr3);
        System.out.println(" ");

        //Example 4 - Comparing Strings
        System.out.println("//////Example 4//////");
        String a = "hello";
        String b = "its me";

        if(a == "hello") {
            //Incorrect way to compare Strings
            //it works with intgers, chars, but not Strings
            //Strings are objects, not primitive datatypes
        }
        if(a.equals("hello")) {
            //correct way to compare Strings
        }
        //Example 5 - Comparing Strings with capitals
        System.out.println("//////Example 5//////");
        if(b.equalsIgnoreCase("ItS ME")) {
            System.out.println("Case ignored");
        }
        //Example 6 - charAt
        System.out.println("//////Example 6//////");
        System.out.println(str.charAt(5)); //Even if str is a String Object
        System.out.println(str.charAt(6));//charAt will return a char
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));

        //Example 7 - indexOf
        System.out.println("//////Example 7//////");
        String str2 = "Hello there yogi there";
        int indx = str2.indexOf("there");
        System.out.println(indx);
        indx = str2.indexOf("there", 7); // to args, like this, will change the starting point
        System.out.println(indx);

        //Example 8 - lastIndexOf
        System.out.println("//////Example 7//////");
        indx = str2.lastIndexOf("yogi");
        System.out.println(indx);
        str2 = "Hello yogi there yogi there";
        indx = str2.indexOf("yogi");
        System.out.println(indx);


    }
}
