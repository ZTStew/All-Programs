/*
 * A simple starting application that prints the hypotenuse of a triangle given the length of the two legs
 *
 * @author Stewart
 * @version JAVA 8, 9/4/2018
 */

public class PythagoreanTest {                                                  // creates a class named, 'PythagoreanTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        PythagoreanDemo hypotenuse = new PythagoreanDemo();                     // creates a method named, 'hypotenuse'
        double hypo = hypotenuse.calculateHypotenuse(3,3);                      // creates a variable named, 'hypo' and sets it equal to a method inside of 'hypotenuse' named, 'calculateHypotenuse' and sends it the needed variables 
        System.out.println("The Hypotenuse: " + hypo);                          // logs what the hypotenuse
    }
}
