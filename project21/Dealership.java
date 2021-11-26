package car_dealership;

public class Dealership {

    public static void main(String[] args) {
        //variables
        boolean finance = false;//finance his car or not
        //Customer Objects
        Customer cust1 = new Customer("Isaac", "Wake St #741", 1000.00);
        Customer cust2 = new Customer("Ramon", "Bunker hill St #71", 6000.00);
        //Employee Objects
        Employee emplo1 = new Employee("Francisco", 30, 2);
        Employee emplo2 = new Employee("Alejandro", 40, 6);
        //Vehicle Objects
        Vehicle car1 = new Vehicle("VW","Vento", 15000.12);
        Vehicle car2 = new Vehicle("Mazda","3", 20000.32);

        //This is the most important action
        cust1.purchaseCar(car1, emplo1, finance);


    }
}
