public class PythagoreanDemo {                                                  // creates a new class named, 'PythagoreanDemo'
    public double calculateHypotenuse(double legA, double legB){                // creates a method named, 'calculateHypotenuse' that accepts two variables named, 'legA' and 'LegB'
        double sum = 0;                                                         // creates a double variable named sum
        legA = legA * legA;                                                     // squares 'legA'
        legB = Math.pow(legB, 2);                                               // squares 'legB' using 'Math'
        // System.out.println("legA is: " + legA);                                 // logs 'legA' to ensure the value is what it is supposed to be
        // System.out.println("legB is: " + legB);                                 // logs 'legB' to ensure the value is what it is supposed to be
        sum = legA + legB;                                                      // adds 'legA' and 'legB' together
        // System.out.println("Sum is now: " + sum);                               // logs 'sum' to ensure the value is what it is supposed to be
        sum = Math.sqrt(sum);                                                   // findes the square root of 'sum'
        return sum;                                                             // returns 'sum'
    }
}
