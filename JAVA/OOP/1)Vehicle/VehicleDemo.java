public class VehicleDemo {                                                      // creates a class named, 'VehicleDemo'
    private int numOfWheels;                                                    // creates a private variable named, 'numOfWheels'
    private String color;                                                       // creates a private variable named, 'color'

    public String GetVehicleColor(){                                            // creates a method named, 'GetVehicleColor'
        return color;                                                           // returns the value of 'color'
    }
    public int GetVehicleWheels(){                                              // creates a method named, 'GetVehicleWheels'
        return numOfWheels;                                                     // returns the value of 'GetVehicleWheels'
    }

    public void SetVehicleColor(String color){                                  // creates a method named, 'SetVehicleColor' which accepts a 'color' 
        this.color = color;                                                     // assigns the current instance of 'color' to the sent in variable 'color'
    }
    public void SetVehicleWheels(int number){                                   // creates a method named, 'SetVehicleWheels' which accepts a 'number'
        numOfWheels = number;                                                   // sets the instance of 'numberOfWheels' equal to the 'number'
    }
}