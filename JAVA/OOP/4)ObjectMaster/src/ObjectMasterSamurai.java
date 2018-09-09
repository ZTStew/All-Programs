public class ObjectMasterSamurai extends ObjectMasterHuman {                    // creates 'ObjectMasterSamurai', an extention of 'ObjectMasterHuman'
    public static int counter = 0;                                              // creates a static variable named, 'counter' and sets it equal to 0

	public ObjectMasterSamurai(){                                               // creates a constructor for 'ObjectMasterSamurai'
        setHP(200);                                                             // sets default health to be 200
        setStr(5);                                                              // sets default strength to be 5
        counter++;                                                              // increases counter by 1
    }

    public void deathBlow(ObjectMasterHuman target){                            // creates a method named, 'deathBlow'
        target.setHP(0);                                                        // sets the "target's" health to be minus the value of the instance object's strength
        setHP(getHP() / 2);                                                     // reduces 'health' by half
        System.out.println("You annihilated your target. You how have only: " + getHP() + " health left."); // confirmation ensuring method worked
        return;                                                                 // returns void
    }

    public void meditate(){                                                     // creates a method named, 'meditate'
        setHP(200);                                                             // sets 'health' to be 200
        System.out.println("You feel refreshed.");                              // confirmation ensuring method worked
        return;                                                                 // returns void
    }

    public void howMany(){                                                      // creates a method named, 'howMany'
        System.out.println("There are currently, " + counter + " Samurai on the battlefield."); // message telling number of 'ObjectMasterSamurai's that been created
        return;                                                                 // returns void
    }

}
