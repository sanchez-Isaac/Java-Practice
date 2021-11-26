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
    public void setCashOnHand(double cashOnHand) {this.cashOnHand = cashOnHand + 500;}

    //Constructor
    public Customer(String name, String address, double cashOnHand) {
        super();
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;}


    //Behaviors
    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        emp.handleCustomer(this, finance, vehicle);

    }




}
