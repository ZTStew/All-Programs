public class BankAccountTest {                                                  // creates a class named, 'BankAccountTest'
    public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        BankAccount accNo1 = new BankAccount();                                 // creates an instance of 'BankAccount' named, 'accNo1'
        BankAccount accNo2 = new BankAccount();                                 // creates an instance of 'BankAccount' named, 'accNo2'
        BankAccount accNo3 = new BankAccount();                                 // creates an instance of 'BankAccount' named, 'accNo3'
        BankAccount accNo4 = new BankAccount();                                 // creates an instance of 'BankAccount' named, 'accNo4'

        accNo2.depositChecking(13);                                             // uses the, 'depositChecking' method of the 'accNo2' object
        accNo2.depositChecking(13);                                             // uses the, 'depositChecking' method of the 'accNo2' object
        accNo2.withdrawChecking(12);                                            // uses the, 'withdrawChecking' method of the 'accNo2' object
        accNo2.withdrawChecking(2);                                             // uses the, 'withdrawChecking' method of the 'accNo2' object
        accNo2.withdrawChecking(14);                                            // uses the, 'withdrawChecking' method of the 'accNo2' object
        accNo2.withdrawChecking(12);                                            // uses the, 'withdrawChecking' method of the 'accNo2' object
        System.out.println(BankAccount.total);                                  // prints the total amount of money in the bank

        accNo3.depositSavings(5);                                               // uses the, 'depositSavings' method of the 'accNo3' object
        accNo3.depositChecking(1.5);                                            // uses the, 'depositChecking' method of the 'accNo3' object
        accNo3.depositSavings(5);                                               // uses the, 'depositSavings' method of the 'accNo3' object
        System.out.println(BankAccount.total);                                  // prints the total amount of money in the bank
    }
}
