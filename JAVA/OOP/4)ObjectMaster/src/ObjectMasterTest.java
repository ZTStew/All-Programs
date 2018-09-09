public class ObjectMasterTest {                                                 // creates a class named, 'ObjectMasterTest'

	public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        ObjectMasterHuman humi1 = new ObjectMasterHuman();                      // creates 'humi1', a new instance of 'ObjectMasterHuman'
		ObjectMasterHuman humi2 = new ObjectMasterHuman();                      // creates 'humi2', a new instance of 'ObjectMasterHuman'
        ObjectMasterWizard wiz1 = new ObjectMasterWizard();                     // creates 'wiz1', a new instance of 'ObjectMasterWizard'
        ObjectMasterWizard wiz2 = new ObjectMasterWizard();                     // creates 'wiz2', a new instance of 'ObjectMasterWizard'
        ObjectMasterNinja nin1 = new ObjectMasterNinja();                       // creates 'nin1', a new instance of 'ObjectMasterNinja'
        ObjectMasterNinja nin2 = new ObjectMasterNinja();                       // creates 'nin2', a new instance of 'ObjectMasterNinja'
        ObjectMasterSamurai sam1 = new ObjectMasterSamurai();                   // creates 'sam1', a new instance of 'ObjectMasterSamurai'
        ObjectMasterSamurai sam2 = new ObjectMasterSamurai();                   // creates 'sam2', a new instance of 'ObjectMasterSamurai'

        humi1.getStats();                                                       // uses the 'getStats' method of 'humi1'
        wiz1.getStats();                                                        // uses the 'getStats' method of 'wiz1'
        nin1.getStats();                                                        // uses the 'getStats' method of 'nin1'
        sam1.getStats();                                                        // uses the 'getStats' method of 'sam1'

        humi1.attack(humi2);                                                    // uses the 'attack' method of 'humi1' on 'humi2'
        wiz2.heal(humi2);                                                       // uses the 'heal' method of 'wiz2' on 'humi2'
        wiz1.fireball(wiz2);                                                    // uses the 'fireball' method of 'wiz1' on 'wiz2'
        nin1.steal(humi2);                                                      // uses the 'steal' method of 'nin1' on 'humi2'
        nin1.runAway();                                                         // uses the 'runAway' method of nin1
        sam1.deathBlow(nin2);                                                   // uses the 'deathBlow' method of 'sam1' on 'nin2'
        sam1.meditate();                                                        // uses the 'meditate' method of 'sam1'
        sam1.howMany();                                                         // uses the 'howMany' method of 'sam1'
	}
}
