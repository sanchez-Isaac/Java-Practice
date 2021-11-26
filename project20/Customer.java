package car_dealership;

public class Customer {
    //Variables
    private String name;
    private String address;
    private double cashOnHand;


    //Getters
    public String getName() {return name;}
    public String getAddress() {return address;}
    public double getCashOnHand() {return cashOnHand;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;	}
    public void setCashOnHand(double cashOnHand) {this.cashOnHand = cashOnHand;}

    //Constructor
    public Customer(String name, String address, double cashOnHand) {
        super();
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;}


    //Behaviors
    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance, Customer Cust) {

        System.out.println("The customer "+ getName() + " Wants to buy a " + vehicle.getModel());
        System.out.println("The customer chose "+ emp.getEmploName() + " To help him buy it ");
        if (finance == true) {
            System.out.println("He decided to finance the car");
            emp.runCreditHistory(Cust, getCashOnHand());
        }
        else {
            System.out.println("He decided not to finance the car");
            emp.processTransaction(Cust, vehicle);
        }


    }




}
