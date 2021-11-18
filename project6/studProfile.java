package com.company;


/*******************************************************
 *ENCAPSULATION
 * studProfile()
 * This class method will hold the values for the students
 * created in main, every variable will be private to
 * avoid problems and the getter and setters will be public
 * for their use in the main method.
 *
 * I modified the default constructor to create multiple
 * studProfile objects from main().
 *****************************************************/
public class studProfile {

    private String name; // private = restricted access
    private String last;
    private int yearOfGrad;
    private double gpa;
    private String declaredMajor;

    // Getters
    public String getName() { return name; }
    public String getLast() { return last; }
    public int getYearOfGrad() { return yearOfGrad; }
    public double getGpa() { return gpa; }
    public String getDeclaredMajor() { return declaredMajor;  }

    // Setters
    public void setName(String newName) { this.name = newName; }
    public void setLast(String newlast) { this.last = newlast; }
    public void setYearOfGrad(int newYearOfGrad) {this.yearOfGrad = newYearOfGrad;  }
    public void setGpa(double newGpa) { this.gpa = newGpa; }
    public void setDeclaredMajor(String newDeclaredMajor) { this.declaredMajor = newDeclaredMajor; }

    //Behaviors
    public String getFulldata(){
        String fullname = getName() +" "+ getLast();
        String yearofGrad = String.valueOf(getYearOfGrad());
        String gpaGet = String.valueOf(getGpa());
        String major = getDeclaredMajor();
        return fullname +" - Graduating: "+ yearofGrad +" - GPA of:" + gpaGet + " - Major: " +major;
    }
    // Constructor
        studProfile(String names, String lasts, int yearOfGrads, double gpas, String declaredMajors ){
            name = names;
            last = lasts;
            yearOfGrad = yearOfGrads;
            gpa = gpas;
            declaredMajor = declaredMajors;
    }
}
