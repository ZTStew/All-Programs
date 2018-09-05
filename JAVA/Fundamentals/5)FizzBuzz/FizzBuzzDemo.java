public class FizzBuzzDemo {                                                     // creates a class named, 'FizzBuzzDemo'
    public String fizzBuzz(int number){                                         // creates a method named, 'fizzBuzz' that expects an int named, 'number'
        // String[] arr = new String[number + 1];                                  // creates an arr that is for only Strings and a variable named, 'arr' and assignes the length to be the size of 'number' + 1 
        String str = "";                                                        // creates a String named, 'str' that is empty
        for(Integer i = 1; i <= number; i++){                                   // loops through all values leading up to and including 'number'
            // System.out.println(i);                                              // logs 'i' to ensure the value of 'i' is what it is supossed to be
            if(i % 15 == 0){                                                    // if 'i' is devisable by 15...
                // System.out.println("FizzBuzz");                                 // log, 'FizzBuzz'
                // arr[i] = "FizzBuzz";                                            // makes the current 'arr' value to be "FizzBuzz"
                // System.out.println(arr[i]);                                     // log the current 'arr' value
                str += "FizzBuzz";                                              // adds to 'str' the String "FizzBuzz"
            } else if(i % 5 == 0){                                              // else if 'i' is devisable by 5...
                // System.out.println("Buzz");                                     // log, 'Buzz'
                // arr[i] = "Buzz";                                                // makes the current 'arr' value to be "Buzz"
                // System.out.println(arr[i]);                                     // log the current 'arr' value
                str += "Buzz";                                                  // adds to 'str' the value "Buzz"
            } else if(i % 3 == 0){                                              // else if 'i' is devisable by 3...
                // System.out.println("Fizz");                                     // log, 'fizz'
                // arr[i] = "Fizz";                                                // makes the current 'arr' value to be "Fizz"
                // System.out.println(arr[i]);                                     // log the current 'arr' value
                str += "Fizz";                                                  // adds to 'str' the value "Fizz"
            } else {                                                            // else...
                // System.out.println(i);                                          // log the value of 'i'
                // arr[i] = i.toString();                                          // // makes the current 'arr' value to be the converted to String form of 'i'
                // System.out.println(arr[i]);                                     // log the current 'arr' value
                str += i;                                                       // adds to 'str' the String value of "i"
            }
            if(i < number){                                                     // if the value of 'i' is less than the value of 'number'...
                str += ", ";                                                    // adds to 'str' the value ", "
            }
        }
        // System.out.println(str);                                                // ensures that 'str' is the right value
        // for(int i = 1; i < arr.length; i++){                                    // loops through 'arr'
        //     System.out.println(arr[i]);                                         // print the value found at the index of 'arr'
        // }
        // return null;                                                            // return null
        return str;                                                             // returns 'str'
    }
}
