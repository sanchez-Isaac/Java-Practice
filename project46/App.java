
public class App {
    //Remember, Lambdas are a way to dissociate
//a set of functions from an object
    public static void main(String[] args) {
        Human tom = new Human();
        tom.walk();
        walker(tom);

        Robot walle = new Robot();
        walker(walle);

        // Anonymous classes
        walker(new Walkable() {
            @Override
            // this method behavior is not tied to a class
            public void walk() {
                System.out.println("Custom object Walking");
                // This is the closest to functional programmig
            }

        });

        // Lambdas expression version
        walker(() -> System.out.println("lambdas custom object walking..."));

        // If we need more than 1 thing to do, we use { }
        walker(() -> {
            System.out.println("lambdas custom object walking...");
            System.out.println("lambdas custom object walking again...");
        });

        // Another weird example
        AlambdaInterface ablockOfCode = () -> {// in Functional programming, we need interfaces
            System.out.println("lambdas custom object walking2...");
            System.out.println("lambdas custom object walking2 again...");
        };

        // Walkable weird example
        Walkable ablockOfCode2 = () -> {// in Functional programming, we need interfaces
            System.out.println("lambdas custom object walking but as a walkable...");
            System.out.println("lambdas custom object walking again but as a walkable...");
        };
        walker(ablockOfCode2);

        // This is a the sayHello() method into lambdas
        // Remember that somethingV needs to have a type functional Programming
        // In this case AlambdaInterface is perfect
        AlambdaInterface somethingV = () -> System.out.println("Soemthing here");

        // This is a the sum() method into lambdas
        Calculate somethingSum = (a, b) -> a + b; // These doesn't need the return
        System.out.println("the sum is: " + somethingSum.compute(4, 4));

        // This is the nonZeroDivide()method into lambdas
        Divide somethingDiv = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        }; // dosent require return
        System.out.println("the division is: " + somethingDiv.computeD(10, 5));

        //This is reverse() method into lambdas
        Reverse str = (a)->{
            String result = "";
            for(int i = a.length() -1; i>=0; i--) {
                result = result + a.charAt(i);
            }
            return result;
        };
        System.out.println("The reverse is: " + str.reverse("this"));

        //This is factorial() method into lambdas
        Factor numFact = (a) -> {
            int result = 1;
            for(int i = 1; i <= a; i++) {
                result = i*result;
            }
            return result;
        };
        System.out.println("The factorial is: " + numFact.computeF(10));

        //Generic lambdas example
        GenInt<String> str2 = (s)->{
            String res = "";
            for(int i = s.length() -1; i>=0; i--) {
                res += s.charAt(i);
            }
            return res;
        };
        System.out.println("The reverse is: " + str2.computeGen("this"));

        //Or this generic factorial
        GenInt <Integer>numFact2 = (a) -> {
            int result = 1;
            for(int i = 1; i <= a; i++) {
                result = i*result;
            }
            return result;
        };
        System.out.println("The factorial is: " + numFact2.computeGen(10));
    }

    // Converting this into a lambdas expression
    public void sayHello() {
        System.out.println("Soemthing here");
    }

    // Converting this into lambdas
    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    // converting this into lambdas
    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    // converting this into lambdas
    public String reverse(String str) {
        String result = "";
        for(int i = str.length() -1; i>=0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    // converting this into lambdas
    public int factorial(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result = i*result;
        }
        return result;

    }



    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }

}

interface Calculate {
    public int compute(int a, int b);
}

interface Divide {
    public int computeD(int a, int b);
}
interface Reverse {
    public String reverse(String string);
}
interface Factor {
    public int computeF(int a);
}
interface GenInt<T>{//generic lambdas
    public int computeGen(T t);
}