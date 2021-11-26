package car_dealership;

public class Vehicle {
    //Variables
    private String make;
    private String model;
    private double price;

    //Getters
    public String getMake() {return make;}
    public String getModel() {return model;}
    public double getPrice() {return price;}

    //Setters
    public void setMake(String make) {this.make = make;	}
    public void setModel(String model) {this.model = model;	}
    public void setPrice(double price) {this.price = price;	}

    //Constructor
    public Vehicle(String make, String model,double price) {
        super();
        this.make = make;
        this.model = model;
        this.price = price;
    }
    //Behaviors
    @Override
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
    }


}
