package car_dealership;

public class Vehicle {
    //Variables
    private String brand;
    private String model;
    private int     year;
    private int horsePow;
    private double price;

    //Getters
    public String getBrand() {return brand;	}
    public String getModel() {return model;}
    public int getYear() {return year;	}
    public int getHorsePow() {return horsePow;}
    public double getPrice() {return price;}

    //Setters
    public void setBrand(String brand) {this.brand = brand;	}
    public void setModel(String model) {this.model = model;	}
    public void setYear(int year) {this.year = year;}
    public void setHorsePow(int horsePow) {this.horsePow = horsePow;}
    public void setPrice(double price) {this.price = price;	}

    //Constructor
    public Vehicle(String brand, String model, int year, int horsePow, double price) {
        super();
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsePow = horsePow;
        this.price = price;
    }
    //Behaviors
    public void startEngine(Customer cust) {
        System.out.println(cust.getName() + " Turned the key on!!");
        System.out.println(cust.getName() + " tried the car!!");
    }
    public void move(Customer cust) {
        System.out.println(cust.getName() + " Is taking the car for a ride!!");
    }


}
