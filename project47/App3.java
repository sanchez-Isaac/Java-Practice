package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App3 {

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

        System.out.println("");
        System.out.println("Function with lambdas:");
        //A lambdas with interface function
        Function<Car, String> priceAndColor = (c)-> " Color = " + c.getPrice() + " Color = " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);


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

    //If we use predicate, we dont need to implement an lambdas interface
    public static void printCars(List<Car> cars, Predicate <Car> predicate) {
        for (Car c: cars) {
            if(predicate.test(c)) {
                c.printCar();
            }
        }
    }


    //////////////////////////////////
    //////////////////////////////////
}





