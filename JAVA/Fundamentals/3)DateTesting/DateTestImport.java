import java.util.Date;                                                          // imports 'Date' method
public class DateTestImport {                                                   // creates a java class named, 'DateTestImport'
    public String getCurrentDate(){                                             // creates a method named, 'getCurrentDate'
        Date date = new Date();                                                 // initalizes a new date
        return "Current Date Is: " + date;                                      // returns string with information in the 'date' variable 
    }
}