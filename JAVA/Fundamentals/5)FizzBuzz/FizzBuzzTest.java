public class FizzBuzzTest {                                                     // creates a class named, 'FizzBuzzTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        FizzBuzzDemo buzz = new FizzBuzzDemo();                                 // creates, 'buzz', an instance of 'FizzBuzzDemo'
        String numBuzz = buzz.fizzBuzz(31);                                     // creats a variable named, 'numBuzz' and sets it equal to the method inside of numBuzz 'fizzBuzz' and gives it a number
        System.out.println(numBuzz);
    }
}
