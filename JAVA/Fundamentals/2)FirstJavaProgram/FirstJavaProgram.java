public class FirstJavaProgram {                                                 // create a java class named 'FirstJavaProgram'

    static String myName = "Name";                                              // creates a static string variable called, 'myName' and assigns a value to the variable
    static int myAge = 1234;                                                    // creates a static int variable called, 'myAge' and assigns a value to the variable
    static String myHomeTown = "Home Place";                                    // creates a static string variable called, 'myHomeTown'

    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        System.out.println("My name is: " + myName + ".");                      // prints to the console string with variable information
        System.out.println("I am " + myAge + " years old.");                    // prints to the console string with variable information
        System.out.println("My hometown is: " + myHomeTown + ".");              // prints to the console string with variable information
        /*
        Me experamenting with typing variables
        // byte numberz = 0;
        // for(byte i = 0; i <= numberz; i++){
        //     System.out.println(i);
        //     numberz++;
        // }
        // int numberz = 2147483646;
        // System.out.println(numberz);
        // numberz++;
        // System.out.println(numberz);
        // numberz++;
        // System.out.println(numberz);
        */
    }
}
