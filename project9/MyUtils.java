package java_basics;

public class MyUtils {

	public static void printSomeJunk() { // dosen't receive arguments from main
		System.out.println("our method");

	}
	public static void printSomeJunk2(String arg) { // receives arguments from main
		System.out.println(arg);   //use the parameter values received from main

	}
	public static void printSomeJunk2(int arg) { // receives arguments from main
		System.out.println(arg);   //use the parameter values received from main

	}

	public static void sum2Nums(int firstArg, int secondArg) {// int parameters
		System.out.println(firstArg + secondArg);
	}

	public static int add10(int someArgs) { // this method isnt void, it returns an int
		int result = someArgs+10;
		return result;


	}

	public static String printSomeJunk(String val) { // dosen't receive arguments from main
		val += "value";

		return val;

	}


}
