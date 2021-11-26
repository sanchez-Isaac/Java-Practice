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
        System.out.println(getEmploName() + " Is serving " + cust.getName());
        System.out.println(" ");
        double doubleAmount = cust.getCashOnHand();

        if(finance == true) {
            runCreditHistory(cust, doubleAmount);
        }
        else if (vehicle.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust, vehicle);
        }
        else {
            System.out.println("Customer needs more money!!");
        }
    }

    public void runCreditHistory(Customer cust, double doubleAmount) {
        System.out.println("running Credit History");
    }

    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Checking purchase...");
        System.out.println("Customer " + cust.getName() + " Wants to buy a " + vehicle.getBrand() + " - "+ vehicle.getModel());
        System.out.println("The customer has: " + cust.getCashOnHand() + " The car price is: " + vehicle.getPrice());

        if (cust.getCashOnHand() < vehicle.getPrice()) {
            System.out.println("Customer dosent have enough money, he can finance it");
        }
        else {
            System.out.println("The customer has enough money!... He got the car!");
        }
    }


}
