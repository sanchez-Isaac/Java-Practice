package client;

public class Application1 {
    //How to grate Generic classes
    public static void main(String[] args) {

        Container container = new Container(12, "Hello"); //The class Container its generic
        //it accepts 2 different types
        //with no complaints but!!!
        // It is not typeSafe!!!!!!!
        container.printItems();

    }

}
