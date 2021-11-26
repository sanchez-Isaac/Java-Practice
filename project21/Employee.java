package car_dealership;

public class Employee {
    //Variables
    private String emploName;
    private int emploAge;
    private int emploYearsOfXP;
    //Getters
    public String getEmploName() {return emploName;}
    public int getEmploAge() {return emploAge;}
    public int getEmploYearsOfXP() {return emploYearsOfXP;}
    //Setters
    public void setEmploName(String emploName) {this.emploName = emploName;}
    public void setEmploYearsOfXP(int emploYearsOfXP) {this.emploYearsOfXP = emploYearsOfXP;}
    public void setEmploAge(int emploAge) {this.emploAge = emploAge;}
    //Constructor
    public Employee(String emploName, int emploAge, int emploYearsOfXP) {
        super();
        this.emploName = emploName;
        this.emploAge = emploAge;
        this.emploYearsOfXP = emploYearsOfXP;
    }
    //Behaviors
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance == true) { // If the costumer wants to finance the car
            //Check the money needed and save it in a variable
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount); // Check if the customer has credit
        }
        else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            processTransaction(cust, vehicle);
        } else { System.out.println("The customer needs more money to purchase the vehicle: " + vehicle.getMake());}
    }

    public void runCreditHistory(Customer cust, double loanAmount) {
        System.out.println("Ran credit history for customer...");
        System.out.println("Customer has been approved to to purchase the vehicle...");
    }

    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Ran credit history for customer...");
        System.out.println("Customer has purchase the vehicle " + vehicle.getModel());
        System.out.println("For the price: " + vehicle.getPrice());
    }

}
