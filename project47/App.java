package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700), new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200), new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300), new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500));

        //this is commented out because we created a functional interface
        //that leaves only one statement to run this code
        //printCarsPriceRange(cars, 18000, 22000);
        //printCarByColor(cars, "Red");

        System.out.println("Printing cars between price 18000, 22000:");
        //The list "Cars" is sent, along with the conditions sent by the user
        printCars(cars, new CarCondition(){
            @Override
            public boolean test(Car c) { //this is equivalent to printCarsPriceRange()
                return c.getPrice() >= 18000 && c.getPrice() <= 22000;
            }
        });
        System.out.println("");
        System.out.println("Printing cars are blue:");
        printCars(cars, new CarCondition(){
            @Override
            public boolean test(Car c) { //this is equivalent to printCarByColor()
                return c.getColor().equals("Blue");
            }
        });
        //Lambdas!!!!
        System.out.println("");
        System.out.println("Lambdas Expression:");
        System.out.println("");
        System.out.println("Printing cars between price 18000, 22000:");
        //This is the lambdas version of the first print
        printCars(cars, (c)-> c.getPrice() >= 18000 && c.getPrice() <= 22000);
        System.out.println("");
        //This is the lambdas version of the second print
        System.out.println("Printing cars are blue:");
        printCars(cars, (c)-> c.getColor().equals("Blue"));
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        for (Car c : cars) {
            if (low <= c.getPrice() && c.getPrice() <= high) {
                c.printCar();
            }
        }
    }

    public static void printCarByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if (c.getColor().equals(color)) {
                c.printCar();
            }
        }
    }

    //The user will determine the condition of the cars to be printed
    //CarCondition condition is up to the user
    public static void printCars(List<Car> cars, CarCondition condition) {
        for (Car c: cars) {
            if(condition.test(c)) {
                c.printCar();
            }
        }
    }


    //////////////////////////////////
    //////////////////////////////////
}






@FunctionalInterface
interface CarCondition {
    public boolean test(Car c);
}