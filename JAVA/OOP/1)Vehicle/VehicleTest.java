public class VehicleTest {                                                      // creates a class named, 'VehicleTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        VehicleDemo bike = new VehicleDemo();                                   // creates, 'bike' a new instance of 'VehicleDemo'
        VehicleDemo car = new VehicleDemo();                                    // creates, 'car' a new instance of 'VehicleDemo'
        bike.SetVehicleWheels(3);                                               // uses the 'SetVehicleWheels' method of 'bike' and gives it value
        bike.SetVehicleColor("aqua");                                           // uses the 'SetVehicleColor' method of 'bike' and gives it value
        car.SetVehicleWheels(4);                                                // uses the 'SetVehicleWheels' method of 'car' and gives it value
        car.SetVehicleColor("cantalope");                                       // uses the 'SetVehicleColor' method of 'car' and gives it value
    
        String bikeColor = bike.GetVehicleColor();                              // creates a variable named, 'bikeColor' and sets it equal to the response
        int bikeWheels = bike.GetVehicleWheels();                               // creates a variable named, 'bikeWheels' and sets it equal to the response
        String carColor = car.GetVehicleColor();                                // creates a variable named, 'CarColor' and sets it equal to the response
        int carWheels = car.GetVehicleWheels();                                 // creates a variable named, 'bikeWheels' and sets it equal to the response

        System.out.println("Bike - Wheels: " + bikeWheels + ", Color: " + bikeColor); // prints values
        System.out.println("Car - Wheels: " + carWheels + ", Color: " + carColor);    // prints values

    }
}
