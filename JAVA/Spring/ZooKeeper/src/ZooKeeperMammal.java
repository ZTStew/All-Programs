public class ZooKeeperMammal {                                                  // creates a class named, 'ZooKeeperMammal'
    private int energy = 100;                                                   // creates a private variable named, 'energy' and assigns it a default value

    public void setEnergy(int energy){                                          // creates a method named, 'setEnergy' that expects a value
        this.energy = energy;                                                   // sets the current instance of 'energy' to the value of the other 'energy'
    }

    public int getEnergy(){                                                     // creates a method named, 'getEnergy'
        return energy;                                                          // returns energy
    }

    public int displayEnergy(){                                                 // creates a method named, 'displayEnergy'
        System.out.println(this.energy);                                        // prints the value of the object's energy
        return energy;
    }
}
