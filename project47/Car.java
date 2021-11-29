package lambda.practical;

public class Car {
    String make, model, color;
    int price;
    public Car(String make, String model, String color, int price) {
        super();
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }


    //Getters
    public String  getMake() {return make; }
    public String getModel() {return model;}
    public String getColor() {return color;}
    public int    getPrice() {return price;}

    //Setters
    public void setMake(String make  ) {this.make = make;  }
    public void setModel(String model) {this.model = model;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(int price   ) {this.price = price;}

    //Behaviors
    public void printCar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
    }

}
