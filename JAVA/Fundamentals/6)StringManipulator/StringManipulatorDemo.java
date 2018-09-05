public class StringManipulatorDemo {                                            // creates a class named, 'StringManipulatorDemo'
    public String trimAndConcat(String word1, String word2){                    // creates a method named, 'trimAndConcat', that accepts two String variables
        String newWord1 = word1.trim();                                         // creates a new variable named, 'newWord1', and sets it equal to 'word1' with the 'trim' method applied to it
        String newWord2 = word2.trim();                                         // creates a new variable named, 'newWord2', and sets it equal to 'word2' with the 'trim' method applied to it
        // System.out.println(newWord1);                                           // prints out the value of, 'newWord1'
        // System.out.println(newWord2);                                           // prints out the value of, 'newWord2'
        return newWord1 + newWord2;                                             // returns newWord1 concatinated with newWord2
    }

    public Integer getIndexOrNull(String str, char letter){                     // creates a method named, 'getIndexOrNull', that accepts a String named, 'str', and a char named, 'letter' 
            // System.out.println(str.indexOf(letter));                            // logs the return of the '.indexOf' command when used on 'str' and searches for, 'letter'
        return str.indexOf(letter);                                             // returns the indexOf 'str' when 'letter' is searched for
    }

    public Integer getIndexOrNull(String str, String letter){                   // creates a method named, 'getIndexOrNull', that accepts a String named, 'str', and a String named, 'letter' 
        return str.indexOf(letter);                                             // returns the indexOf 'str' when 'letter' is searched for
    }

    public String concatSubstring(String word1, int val1, int val2, String word2){// creates a method named, 'concatSubstring', that accepts and assigns names to inputs
        String val = newWord1.substring(val1, val2);                            // creates a String variable named, 'val' and sets it equal to word1 when split with val1 and val2
        val = val + word2;                                                      // concatinates onto 'val' itself and the value of 'word2'
        return val;                                                             // returns 'val'
    }
}
