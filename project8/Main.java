package java_basics;

public class Variables {

    public static void main(String[] args) {
        // Learning IF Statements + switch Flows

        boolean hungry = true; //will control the flow of the program

        if(hungry) { //if Hungry is true
            System.out.println("Im'starving!"); //this message is going to be printed to
        } else {                               // the console
            System.out.println("Im not hungry"); // if hungry is false, then this message will be used
        }


        int hungeRating = 5; //here, hungeRating will manage the conditions
        if (hungeRating < 6) { //if hungeRating is less than 6
            System.out.println("Not hungry"); //this message will be printed into the console
        } else {
            System.out.println("Im starving");//if hungeRating is more than 6 this message
        }                                    // will be printed to the console



        int favoriteTemp = 75; //These variables will manage the conditions now
        int currentTemp = 60;
        String opinion; //opinion value will be assigned in the IF conditions

        if(currentTemp < favoriteTemp - 30 ) { // favoriteTemp will decrease its temp -30
            opinion = "It's Preatty Darn Cold...";
        } else if (currentTemp < favoriteTemp - 20) {// favoriteTemp will decrease its temp -20
            opinion = "It's kinda cold out...";
        } else if(currentTemp > favoriteTemp + 10) { // favoriteTemp will increase its temp +10
            opinion = "It's hot out";
        } else {
            opinion = "It's a beautiful day";
        }

        System.out.println(opinion);


        int month = 4; //For the Switch, month will control the flow
        String monthString; // String will receive the value depending of the month

        switch(month) {
            case 1: monthString = "January"; // assign the value if case 1
                break;                           // break out of the switch
            case 2: monthString = "February";// assign the value if case 2
                break;                          // break out of the switch
            case 3: monthString = "March";// assign the value if case 3
                break;                          // break out of the switch
            case 4: monthString = "April";// assign the value if case 4
                break;                          // break out of the switch
            case 5: monthString = "May";// assign the value if case 5
                break;                          // break out of the switch
            default: monthString = "Unknown Month"; // if no value is found, then default
                break;                          // break out of the switch
        }
        System.out.println(monthString); // print the value
    }

}
