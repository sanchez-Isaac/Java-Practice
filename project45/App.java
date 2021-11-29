
public class App {

    public static void main(String[] args) {
        Human tom = new Human();
        tom.walk();
        walker(tom);

        Robot walle = new Robot();
        walker(walle);


        //Anonymous classes
        walker(new Walkable() {
            @Override
            //this method behavior is not tied to a class
            public void walk() {
                System.out.println("Custom object Walking");
                //This is the closest to functional programmig
            }

        });

        //Lambdas expression version
        walker( ()-> System.out.println("lambdas custom object walking..."));

        //If we need more than 1 thing to do, we use { }
        walker( ()-> {
            System.out.println("lambdas custom object walking...");
            System.out.println("lambdas custom object walking again...");
        });

        //Another weird example
        AlambdaInterface ablockOfCode = ()-> {// in Functional programming, we need interfaces
            System.out.println("lambdas custom object walking2...");
            System.out.println("lambdas custom object walking2 again...");
        };

        //Walkable weird example
        Walkable ablockOfCode2 = ()-> {// in Functional programming, we need interfaces
            System.out.println("lambdas custom object walking but as a walkable...");
            System.out.println("lambdas custom object walking again but as a walkable...");
        };
        walker(ablockOfCode2);

    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
