import java.util.ArrayList;                                                     // imports to file ArrayList

public class ExceptionsDemo {                                                   // creates a new class named, 'ExceptionsDemo'
    public String exList(){                                                     // creates a method named, 'exList'
        ArrayList<Object> theList = new ArrayList<Object>();                    // creates an ArrayList object named, 'theList'
        theList.add("13");                                                      // adds value to 'theList'
        theList.add("hello world");                                             // adds value to 'theList'
        theList.add(48);                                                        // adds value to 'theList'
        theList.add("Goodbye World");                                           // adds value to 'theList'

        for(int i = 0; i < theList.size(); i++){                                // loops throught the objects in 'theList'
            try {                                                               // try...
                String foundValue = (String) theList.get(i);                    // creates a variable named, 'foundValue' and sets it equal to the current 'i' index of 'theList'
                System.out.println(foundValue);                                 // prints the value of 'foundValue'
            } catch (ClassCastException e) {                                    // if the try fails and if the error matches the specified error, run the contents and assign the error to 'e'
                Integer foundValue = (Integer) theList.get(i);                  // creates a variable named, 'foundValue' and sets it equal to the current 'i' index of 'theList'
                System.out.println(foundValue);                                 // prints the value of 'foundValue'
            }
            // System.out.println(foundValue);
        }
        return null;                                                            // return null
    }
}
