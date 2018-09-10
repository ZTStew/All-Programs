public class Galaxy extends Phone implements Ringable {                         // creates a class named, 'Galaxy' that extends 'Phone' and implements 'Ringable'
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {   // creates a constructor for the 'Galaxy' class
        super(versionNumber, batteryPercentage, carrier, ringTone);             // inheritest specified information from 'Phone'
    }
    @Override                                                                   // makes file use its own version or the specified method
    public String ring() {                                                      // creates a method named, 'ring'
        return this.getRingTone();                                              // returns the result of the 'getRingTone' method from 'Phone.java'
    }
    @Override                                                                   // makes file use its own version or the specified method
    public String unlock() {                                                    // creates a method named, 'unlock'
        return "Phone Unlocked.";                                               // returns string for confirmation
    }
    @Override                                                                   // makes file use its own version or the specified method
    public void displayInfo() {                                                 // creates a method named, 'displayInfo'
        System.out.println(getVersionNumber());                                 // prints the return of the 'getVersionNumber' method
        System.out.println(getBatteryPercentage());                             // prints the return of the 'getBatteryPercentage' method
        System.out.println(getCarrier());                                       // prints the return of the 'getCarrier' method
    }
}
