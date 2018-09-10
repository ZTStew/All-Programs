public class PhoneTest {                                                        // creates a class named, 'PhoneTest'
    public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        IPhone iPhoneNaN = new IPhone("NaN", 0, "Generic Guys", "Wrong");       // creates an instance of 'IPhone' named, 'iPhoneNaN'
        Galaxy galaxyT = new Galaxy("GalaxyT", 80, "Galactic People", "Ring, Ring, Ring."); // creates an instance of 'Galaxy' named, 'galaxyT'

        iPhoneNaN.displayInfo();                                                // uses the 'displayInfo' method of 'iPhoneNaN' object
        System.out.println(iPhoneNaN.ring());                                   // prints the return of the 'ring' method of the 'iPhoneNaN' object
        System.out.println(iPhoneNaN.unlock());                                 // prints the return of the 'unlock' method of the 'iPhoneNaN' object

        System.out.println("-------------------------");                        // prints spacer for organization

        galaxyT.displayInfo();                                                  // uses the 'displayInfo' method of 'galaxyT' object
        System.out.println(galaxyT.ring());                                     // prints the return of the 'ring' method of the 'galaxyT' object
        System.out.println(galaxyT.unlock());                                   // prints the return of the 'unlock' method of the 'galaxyT' object

    }
}