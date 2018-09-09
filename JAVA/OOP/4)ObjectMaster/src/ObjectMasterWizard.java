public class ObjectMasterWizard extends ObjectMasterHuman {                     // creates 'ObjectMasterWizard', an extention of 'ObjectMasterHuman'
    public ObjectMasterWizard(){                                                // constructor for 'ObjectMasterWizard'
        setHP(50);                                                              // sets default 'health' to be 50
        setInt(8);                                                              // sets default 'intelligence' to be 8
    }

    public void heal(ObjectMasterHuman target){                                 // creates a method named, 'heal'
        target.setHP(target.getHP() + getInt());                                // sets the "target's" health to be plus the value of the instance object's 'intelligence'
        System.out.println("Healed target for: " + getInt() + " health. The target's health is now: " + target.getHP()); // confirmation ensuring method worked
        return;                                                                 // return void
    }

    public void fireball(ObjectMasterHuman target){                             // creates a method named, 'fireball'
        target.setHP(target.getHP() - (getInt() * 3));                          // sets the "target's" health to be minus the value of the instance object's 'intelligence' times 3
        System.out.println("You magicly attacked your target for, " + (getInt() * 3) + " damage and have left your target with, " + target.getHP() + " health."); // confirmation ensuring method worked
        return;                                                                 // return void
    }
}
