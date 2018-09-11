/*
 * A simple starting application that prints the current date when called
 *
 * @author Stewart
 * @version JAVA 8, 9/4/2018
 */

// do not have to explicitly tell file to import DataTestImport because it is in the same file
public class DateTest {                                                         // create a class named, 'DateTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        DateTestImport id = new DateTestImport();                               // creates a method called 'id'
        String currentDate = id.getCurrentDate();                               // creates a variable named, 'currentDate' that is set to be equal to the 'currentDate' method belonging to the instance of the id
        System.out.println(currentDate);                                        // prints to the console the value of currentDate
    }
}
