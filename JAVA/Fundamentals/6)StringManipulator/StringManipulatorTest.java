/*
 * An application to test the various commands for interacting with strings
 *
 * @author Stewart
 * @version JAVA 8, 9/5/2018
 */

public class StringManipulatorTest {                                            // creates a class named, 'StringManipulatorTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        
        StringManipulatorDemo manipulator = new StringManipulatorDemo();        // creates 'manipulator', an instance of 'StringManipulatorDemo'
        String str = manipulator.trimAndConcat("    Hello     ","   World  ");  // creates a variable named, 'str' and sets it equal to the method 'trimAndConcat' and gives it variables to use
        System.out.println(str);                                                // prints out the value of 'str'

        char letter = 'o';                                                      // creates a char variable named, 'letter' and sets it equal to "o"
        Integer a = manipulator.getIndexOrNull("Coding", letter);               // creates a variable named, 'a' and sets it equal to the method 'getIndexOrNull' and gives it a string and gives it 'letter'
        Integer b = manipulator.getIndexOrNull("Hello World", letter);          // creates a variable named, 'b' and sets it equal to the method 'getIndexOrNull' and gives it a string and gives it 'letter'
        Integer c = manipulator.getIndexOrNull("Hi", letter);                   // creates a variable named, 'c' and sets it equal to the method 'getIndexOrNull' and gives it a string and gives it 'letter'
        System.out.println(a);                                                  // prints 'a'
        System.out.println(b);                                                  // prints 'b'
        System.out.println(c);                                                  // prints 'c'
    
        String word = "Hello";                                                  // creates a String variable named, 'word' and assignes it a value
        String subString = "llo";                                               // creates a String variable named, 'subString' and assignes it a value
        String notSubString = "world";                                          // creates a String variable named, 'notSubString' and assignes it a value
        Integer d = manipulator.getIndexOrNull(word, subString);                // creates a variable named 'd' and sets it equal to the method 'getIndexOrNull' and gives it a 'word' and 'subString'
        Integer e = manipulator.getIndexOrNull(word, notSubString);             // creates a variable named 'e' and sets it equal to the method 'getIndexOrNull' and gives it a 'word' and 'notSubString'
        System.out.println(d);                                                  // prints 'd'
        System.out.println(e);                                                  // prints 'e'
    
        String anotherWord = manipulator.concatSubstring("Hello", 1, 2, "world");// creates a variable named, 'anotherWord' and sets it equal to the, 'concatSubstring' method and gives it values
        System.out.println(anotherWord);                                        // prints 'anotherWord'
    }
}
