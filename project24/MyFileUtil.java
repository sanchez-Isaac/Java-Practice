package java_practice;

public class MyFileUtil {//own defined method that throws exceptions
	/*
	public int substract10FromLArgerNumber(int number) throws Exception {
		if(number < 10) {
			//The new keyword is used because Exception is a class
			throw new Exception("The number passed was smaller than 10");
			         //Exception is already part of the java language
		}
		return -10;
	}

	*/

    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////////OWN CREATED EXCEPTION////////////////////////////
    public int substract10FromLArgerNumber(int number) throws FooRuntimeEception {
        if(number < 10) {
            //The new keyword is used because Exception is a class
            throw new FooRuntimeEception("The number passed was smaller than 10");
            //Exception is already part of the java language
        }
        return number -10;
    }

    //define own exception
    //This is just an examplebut normally you would need to create a package
    //and the package needs to have a name that dosent have conflics with
    //the already define java utilities: com.isaac.exceptions
    //then import the data package into the program
    public class FooRuntimeEception extends Exception {//this is inheriting from Exception
        public FooRuntimeEception(String message) {
            super(message);
        }
    }
}
