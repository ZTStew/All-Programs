public class ObjectMasterHuman {                                                // creates a class named, 'ObjectMasterHuman'
    private int health = 100;                                                   // creates a private variable named, 'health' and gives it a default value
    private int strength = 3;                                                   // creates a private variable named, 'strength' and gives it a default value
    private int intelligence = 3;                                               // creates a private variable named, 'intelligence' and gives it a default value
    private int stealth = 3;                                                    // creates a private variable named, 'stealth' and gives it a default value

    public void getStats(){                                                     // creates a method named 'getStats'
        System.out.println("Health is: " + health);                             // print message to track value of 'health'
        System.out.println("Strength is: " + strength);                         // print message to track value of 'strength'
        System.out.println("Intelligence is: " + intelligence);                 // print message to track value of 'intelligence'
        System.out.println("Stealth is: " + stealth);                           // print message to track value of 'stealth'
        return;                                                                 // return void
    }

    public int getHP(){                                                         // creates a method named, 'getHP'
        return health;                                                          // returns the value of 'health'
    }
    public int getStr(){                                                        // creates a method named, 'getStrength'
        return strength;                                                        // returns the value of 'strength'
    }
    public int getInt(){                                                        // creates a method named, 'getInt'
        return intelligence;                                                    // returns the value of 'intelligence'
    }
    public int getStealth(){                                                    // creates a method named, 'getStealth'
        return stealth;                                                         // returns the value of 'stealth'
    }

    public void setHP(int hp){                                                  // creates a method named, 'setHP' that accepts a variable
        health = hp;                                                            // sets the value of 'health' to whatever the value of 'hp' is
    }
    public void setStr(int str){                                                // creates a method named, 'setStr' that accepts a variable
        strength = str;                                                         // sets the value of 'strength' to the value of 'str'
    }
    public void setInt(int intel){                                              // creates a method named, 'setInt' that accepts a variable
        intelligence = intel;                                                   // sets the value of 'intelligence' to the value of 'intel'
    }
    public void setStealth(int stealth){                                        // creates a method named, 'setStealth' that accepts a variable
        this.stealth = stealth;                                                 // sets the current intance of 'stealth' to the value of 'stealth'
    }

    public void attack(ObjectMasterHuman target){                               // creates a method named, 'attack'
        
        target.setHP(target.getHP() - getStr());                                // sets the "target's" health to be minus the value of the instance object's strength

        System.out.println("You attacked your target for, " + getStr() + " damage and have left your target with, " + target.getHP() + " health."); // confirmation ensuring method worked
        return;                                                                 // retuns void

    }

    public void buffHP(){                                                       // creates a method named, 'buffHP'
        setHP(getHP() + 10);                                                    // increases 'health' by 10
    }
    public void buffStr(){                                                      // creates a method named, 'buffStr'
        setStr(getStr() + 1);                                                   // increases 'strength' by 1
    }
    public void buffInt(){                                                      // creates a method named, 'buffInt'
        setInt(getInt() + 1);                                                   // increases 'intelligence' by 1
    }
    public void buffStealth(){                                                  // creates a method named, 'buffStealth'
        setStealth(getStealth() + 1);                                           // increases 'stealth' by 1
    }
}
