public class ZooKeeperGorilla extends ZooKeeperMammal {                         // creates a class named, 'ZooKeeperGorilla' that is an extention of 'ZooKeeperMammal'

    public void throwSomething(){                                               // creates a method named, 'throwSomething'
        if(getEnergy() >= 5){                                                   // if the current energy is greater than or equal to 5...
            System.out.println("Trown a tire.");                                // print message
            setEnergy(getEnergy() - 5);                                         // reduce the object's current energy
        } else {                                                                // else...
            System.out.println("I am too tired. I only have " + getEnergy() + " energy.");//print that there was not enough energy for the action
        }
        return;                                                                 // return noting
    }

    public void eatBananas(){                                                   // creates a method named, 'eatBananas'
        System.out.println("Nom Nom Nom.");                                     // prints message
        setEnergy(getEnergy() + 10);                                            // adds to the object's current energy
        return;                                                                 // return noting
    }

    public void climb(){                                                        // creates a method named 'climb'
        if(getEnergy() >= 10){                                                  // if the current energy is greater than or equal to 10...
            System.out.println("Climb The Tree.");                              // prints a message
            setEnergy(getEnergy() - 10);                                        // reduces the object's current energy
        } else {                                                                // else...
            System.out.println("I am too tired. I only have " + getEnergy() + " energy.");//print that there was not enough energy for the action
        }
        return;                                                                 // return noting
    }
}
