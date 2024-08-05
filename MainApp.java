public class MainApp {

    //private here means that only this class
    //can see this counter variable!
    //ie other classes can NOT see counter

    //STATIC means: this variable lives for the duration of the program
    //and the value is retained across method calls

    //static variable is VERY different than a LOCAL variable, because
    // local variables will NOT hold their value across method calls

    //if i don't initalize this counter, what happens?
    // it will initialize to a 0!!
    public static int counter;
    // private == only accessible in THIS class and no OTHER classes


    //it will be MORE common to have NON-static variables
    //because non-static are

    public static void main(String[] args) {

        System.out.println(counter);
    }

    public static void anotherMethod() {

        int someLocal = 12;



        counter--; // set back to 8
        System.out.println(counter);
    }
}
