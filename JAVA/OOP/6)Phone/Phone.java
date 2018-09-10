public abstract class Phone {                                                   // creates an abstract class named, 'Phone'
    private String versionNumber;                                               // creates a private variable named, 'versionNumber'
    private int batteryPercentage;                                              // creates a private variable named, 'batteryPercentage'
    private String carrier;                                                     // creates a private variable named, 'carrier'
    private String ringTone;                                                    // creates a private variable named, 'ringTone'

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){ // constructor for 'Phone'
        this.versionNumber = versionNumber;                                     // assigns this instance of 'versionNumber' to the variable named, 'VersionNumber'
        this.batteryPercentage = batteryPercentage;                             // assigns this instance of 'batteryPercentage' to the variable named, 'batteryPercentage'
        this.carrier = carrier;                                                 // assigns this instance of 'carrier' to the variable named, 'carrier'
        this.ringTone = ringTone;                                               // assigns this instance of 'ringTone' to the variable named, 'ringTone'
    }

    public abstract void displayInfo();                                         // creates an abstract method named 'displayInfo'

    public String getRingTone(){                                                // creates a method named, 'getRingTone'
        return this.ringTone;                                                   // returns the value of the current instance of 'ringTone'
    }

    public void setRingTone(String ringTone){                                   // creates a method named, 'getRingTone'
        this.ringTone = ringTone;                                               // returns the value of the current instance of 'ringTone'
    }

    public void unlock(){                                                       // creates a method named, 'unlock'
        return;                                                                 // returns void
    }

    public String getVersionNumber(){                                           // creates a method named, 'getVersionNumber'
        return this.versionNumber;                                              // returns the value of the current instance of 'versionNumber'
    }

    public int getBatteryPercentage(){                                          // creates a method named, 'getBatteryPercentage'
        return this.batteryPercentage;                                          // returns the value of the current instance of 'batteryPercentage'
    }

    public String getCarrier(){                                                 // creates a method named, 'getCarrier'
        return this.carrier;                                                    // returns the value of the current instance of 'carrier'
    }
}
