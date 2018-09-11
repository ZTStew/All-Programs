/*
 * A simple starting application to print 'Hello World'
 *
 * @author Stewart
 * @version JAVA 8, 9/4/2018
 */

public class HelloWorld {                                                       // creates a java class named HelloWorld. Same name as the file.
    public static void main(String[] args){                                     // creates a method named 'main' to act as the starting point of the code. We do not expect a return so we are using void.
        System.out.println("Hello World");                                       // outputs from the system a printline of "HelloWorld"
    }
}

/*
creates a class | names that class what is specified
         |         |
         V         V
public class HelloWorld {
void is the return type of the method(means we are not doing or returning anything)
                    | entry point method
                    |    |  arguments, an array of strings
                    |    |    |
                    V    V    V
    public static void main(String[] args){
        system is a class that comes with every java program
           |   out is a variable of the 'system' class that returns an object of the 'PrintString' class
           |    |    the 'PrintString' class has a method named 'println' (print line)
           |    |      |       What is printed to the screen
           |    |      |         |
           V    V      V         V
        System.out.println("HelloWorld");
    }
}
*/
