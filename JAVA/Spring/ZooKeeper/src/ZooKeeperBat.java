public class ZooKeeperBat extends ZooKeeperMammal {                             // creates a class named, 'ZooKeeperBat' an extention of 'ZooKeeperMammal'

    public ZooKeeperBat(){                                                      // creates a constructor for 'ZooKeeperBat' named, 'ZooKeeperBat'
        setEnergy(300);                                                         // runs the 'setEnergy' method to give 'ZooKeeperBat' a default value
    }

    public void fly(){                                                          // creates a method named, 'fly'
        if(getEnergy() >= 50){                                                  // if the current energy is greater than or equal to 50...
            System.out.println("Flap, Flap, Flap.");                            // prints confirmation statement
            setEnergy(getEnergy() - 50);                                        // reduce the object's current energy
        } else {                                                                // else...
            System.out.println("Too tired to flap. I only have " + getEnergy() + " energy.");//print that there was not enough energy for the action
        }
        return;                                                                 // returns nothing
    }

    public void eatHumans(){                                                    // creates a method named, 'eatHummans'
        System.out.println("Nom, Nom, Nom.");                                   // prints confirmation message
        setEnergy(getEnergy() + 25);                                            // increases the object's current energy
        return;                                                                 // returns nothing
    }

    public void attackTown(){                                                   // creates a method named, 'attackTown'
        if(getEnergy() >= 100){                                                 // if the current energy is greater than or equal to 100...
            System.out.println("Rar...");                                       // prints confirmation message
            setEnergy(getEnergy() - 100);                                       // reduce the object's current energy
        } else {                                                                // else...
            System.out.println("To tired to destroy stuff. I only have " + getEnergy() + " energy.");//print that there was not enough energy for the action
        }
        return;                                                                 // returns nothing
    }


}
