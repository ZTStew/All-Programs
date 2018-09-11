public class ZooKeeperTest {                                                    // creates a class named, 'ZooKeeperTest'

	public static void main(String[] args) {                                    // creates an entry point method that expects no returns
		ZooKeeperGorilla gorilla = new ZooKeeperGorilla();                      // creates 'gorilla', a new instance of ZooKeeperGorilla

        gorilla.throwSomething();                                               // uses the 'throwSomething' method of the 'gorilla' object
        gorilla.throwSomething();                                               // uses the 'throwSomething' method of the 'gorilla' object
        gorilla.throwSomething();                                               // uses the 'throwSomething' method of the 'gorilla' object
        gorilla.eatBananas();                                                   // uses the 'eatBannanas' method of the 'gorilla' object
        gorilla.eatBananas();                                                   // uses the 'eatBannanas' method of the 'gorilla' object
        gorilla.climb();                                                        // uses the 'climb' method of the 'gorilla' object
        gorilla.displayEnergy();                                                // uses the 'displayEnergy' method of the 'gorilla' object
	
        ZooKeeperBat bat = new ZooKeeperBat();

        bat.displayEnergy();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
    }
}
