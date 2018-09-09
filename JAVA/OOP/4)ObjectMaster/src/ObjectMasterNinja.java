public class ObjectMasterNinja extends ObjectMasterHuman {                      // creates 'ObjectMasterNinja', an extention of 'ObjectMasterHuman'
    
    public ObjectMasterNinja(){                                                 // creates a constructor for 'ObjectMasterNinja'
        setStealth(10);                                                         // sets default stealt to 10
    }

    public void steal(ObjectMasterHuman target){                                // creates a method named 'steal'
        target.setHP(target.getHP() - getStealth());                            // sets the "target's" health to be minus the value of the instance object's strength
        setHP(getHP() + getStealth());                                          // increases "object's" 'health' by 'stealth' level
        System.out.println("You have attacked the target for, " + getStealth() + " and have healed for, " + getStealth() + " health."); // confirmation ensuring method worked
        return;                                                                 // returns void
    }

    public void runAway(){                                                      // creates method named, 'runAway'
        setHP(getHP() - 10);                                                    // reduces 'health' by 10
        System.out.println("While running away you lost 10 health.");           // confirmation ensuring method worked
        return;                                                                 // returns void
    }
}
