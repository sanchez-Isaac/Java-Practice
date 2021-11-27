package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {
    // GENERICS with WILDCARDS
    public static void main(String[] args) {

        Object myObject = new Object();//all instances created are objects -inheritance
        String myVar = "hello";//String is an object - inherits from Object parent class
        myObject = myVar;// Legal java code - inheritance - polymorphism

        /////////////

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc; //This is called polymorphism

        ////////
        //Accountants in theory are employees, but in generic we
        //cannot assign employees to accountants
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        //The relationships break apart with generics
        /*-----employees = accountants; //----This is illegal     */


        //Generics offer typesafe code but not flexibility
        //We can make them flexible with Wildcards <?>
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList <Accountant> accountants2 = new ArrayList<Accountant>();
        employees2 = accountants2; //This will not generate a problem
        //By giving the <?> wildcard, any type of data will be allowed as
        //long as one of the ArrayLists has a wildcard, the others can be
        //<String> <Integer> <Double> ..... etc

        //Other Example:
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        //this is a list that accepts data of type Employee and as well as children of Employee.
        ArrayList <Accountant> accountants3 = new ArrayList<>();//Accountant is a children type of Employee
        employees3 = accountants3; //This works, because:
        //class Accountant extends Employee, therefore its a child, <String> does not
        //If class Accountant extends Employee was '---> class Accountant implements Employee
        // it would still work
        /////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////        Part2//////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////

        ArrayList<? super Employee> employee4 = new ArrayList<>();
        //Super means child or parent of employee
        ArrayList<Accountant> accountants4 = new ArrayList <>();
        /*employees4 = accountants4;*/ // illegal sub classes are not permitted, only Employees
        ArrayList<Object> accountantsf = new ArrayList <>();
        employee4 = accountantsf; //This works because is a parent class

        employees.add(new Employee());//This employee addition is to test the method below
        accountants4.add(new Accountant());
        makeEmployeeWork(employees);
        makeEmployeeWork(accountants4);
    }


    //by addingv <? extends Employee> this method becomes generic
    public static void makeEmployeeWork(List<? extends Employee> employees) {
        for(Employee emp : employees) {
            emp.work();
        }
    }





}
