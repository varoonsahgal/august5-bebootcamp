package oop; //basically a folder


public class DrivingClass {

    public static void main(String[] args)
    {

        Person p1 = new Person();

        p1.name = "test";

        //how do we create an object of a class?
        //like this:

        //this p1 object represents ONE Person
        //typically would you just create one object and that's it?
        //no, you would create them as you need them, as people
        // interact with your application!
        //THIS WILL CALL MY CONSTRUCTOR, A CONSTRUCTOR IS JUST
        // A SPECIAL METHOD THAT IS USED TO INITIALIZE YOUR OBJECT!!


//
//        //this is how we instantiate a class, this creates an object called p2
//        Person p2 = new Person("Mary");

        //this invokes the "default" constructor
        // which Java gives us for free if we don't define constructor(s) ourselves...
        //when SSN is public i can change the value
        //directly from the object
        // this is not a good idea!
        //
       int ssn =  p1.getSSN();
        // a class is just a FLAT file
        // but an OBJECT is a living breathing thing in MEMORY

    }
}
