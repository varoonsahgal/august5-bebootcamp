package oop;

public class Person {

    //class variables == instance variables, name and age

    // what if i don't have an access modifier like this:
    // Java will give this a default level of access called "package-private"

    // package-private means that it's accessible to any class in the SAME package
    //package == folder..
    protected String name;
    private int age;

    private int SSN = 23894783;


    public int getSSN() {
        return SSN;
    }

    private double currentYearIncome;

    //this is our constructor
    //how do i know it's a constructor?
    // has the same name as the class!!
    //why do we need it?
    //when we create objects, this is the method that will get called FIRST

    //constructor is ENTRY POINT to class and will create objects
    //now Person is no LONGER GREYED out, because we created an object!

//    public Person(String name, int age) {
//        //what does "this" mean here??
//        //what we are triyng to say here is "set the class variable of the
//        // current object to the name that was passed in to the constructor...
//        this.name = name;
//        this.age = age;
//    }
//
//
//    public Person(String name) {
//        //what does "this" mean here??
//        //what we are triyng to say here is "set the class variable of the
//        // current object to the name that was passed in to the constructor...
//        this.name = name;
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

