package java_practice;

public class Employee implements Comparable<Employee>{
    String name;
    int salary;
    String department;
    //Constructor
    public Employee(String name, int salary, String department) {
        super();
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override //When we call implements, we need to sign all the methods that
    //are required, in this case compareTo();
    public int compareTo(Employee o) {
        // Here the compare rules will be established
        if(this.salary < o.salary) { //If the salary is less than the arg.salary passed in
            return -1; //return false
        } else if(this.salary > o.salary) { //if the salary is greater than the rg.salary passed in
            return 1; //return true
        }
        return 0; //else do nothing, the salaries are the same
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }





}
