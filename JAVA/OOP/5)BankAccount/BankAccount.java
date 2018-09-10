import java.util.Random;                                                        // allows file to use random

public class BankAccount {                                                      // creates a class named, 'BankAccount'
    public static int counter = 0;                                              // creates a static variable named, 'counter' that will hold on to the total number of accounts
    public static double total = 0;                                             // creates a static variable named, 'total' that will hold on to the total amount of money accross all accounts
    
    private String accNum = Integer.toString(counter + 1);                      // creates a private variable named, 'accNum' and assigns it a value
    private double checking = 0;                                                // creates a private variable named, 'checking' and assigns it a value
    private double savings = 0;                                                 // creates a private variable named, 'savings' and assigns it a value

    public BankAccount(){                                                       // creates a constructor for 'BankAccount'
        counter++;                                                              // increases the value of 'counter'
    }

    public void getInfo(){                                                      // creates a method named, 'getInfo'
        System.out.println("Account Number is: " + accNum);                     // prints the value of accNum
        System.out.println("Current checking is: " + checking);                 // prints the value of checking
        System.out.println("Current savings is: " + savings);                   // prints the value of savings
        System.out.println("Total number of accounts is: " + counter);          // prints the value of counter
        return;                                                                 // returns void
    }

    public String getAccNum(){                                                  // creates a method named 'getAccNum'
        return this.accNum;                                                     // returns the value of 'accNum'
    }

    public double getChecking(){                                                // creates a method named 'getChecking'
        return this.checking;                                                   // returns the value of 'checking'
    }

    public double getSavings(){                                                 // creates a method named 'getSavings'
        return this.savings;                                                    // return the value of 'savings'
    }

    public void depositChecking(double amount){                                 // creates a method named, 'depositChecking' that accepts a variable
        this.checking += amount;                                                // adds the value of 'amount' to 'checking'
        total += amount;                                                        // adds the value of 'amount' to 'total'
        System.out.println("You have successfully deposited $" + amount + " into your checking account. Your new balance is: $" + checking + ".");  // print confirmation and update
    }

    public void depositSavings(double amount){                                  // creates a method named, 'depositSavings' that accepts a variable
        this.savings += amount;                                                 // adds the value of 'amount' to 'savings'
        total += amount;                                                        // adds the value of 'amount' to 'total'
        System.out.println("You have successfully deposited $" + amount + " into your savings account. Your new balance is: $" + savings + ".");   // print confirmation and update

    }

    public void withdrawChecking(double amount){                                // creates a method named, 'withdrawChecking' that accepts a variable
        if(checking - amount < 0){                                              // if the value of 'checking' minus the value of 'amount' is less than 0...
            System.out.println("Not enough money in Checking account. You only have, $" + checking + ".");  // print that the account does not have enough money stored and the value in the account
            return;                                                             // return void
        } else {                                                                // else...
            checking -= amount;                                                 // reduce the value of 'checking' by the value of 'amount'
            total -= amount;                                                    // reduce the value of 'total' by the value of 'amount'
            System.out.println("You have successfully withdrawn $" + amount + " into your account. Your new balance is: $" + checking + ".");   // print confirmation and update
            return;                                                             // return void
        }
    }

    public void withdrawSavings(double amount){                                 // creates a method named, 'withdrawSavings' that accepts a variable
        if(savings - amount < 0){                                               // if the value of 'checking' minus the value of 'amount' is less than 0...
            System.out.println("Not enough money in Savings account. You only have, $" + savings + ".");    // print that the account does not have enough money stored and the value in the account
            return;                                                             // return void
        } else {                                                                // else...
            savings -= amount;                                                  // reduce the value of 'savings' by the value of 'amount'
            total -= amount;                                                    // reduce the value of 'total' by the value of 'amount'
            System.out.println("You have successfully withdrawn $" + amount + " into your account. Your new balance is: $" + savings + ".");    // print confirmation and update
            return;                                                             // return void
        }
    }
}
