public class ZooKeeperTest {
    public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        // ZooKeeperMammal animal = new ZooKeeperMammal();
        ZooKeeperGorilla gorilla = new ZooKeeperGorilla();
        ZooKeeperBat vampireBat = new ZooKeeperBat();

        gorilla.throwThings().throwThings().eatBannana().throwThings().climb();
        vampireBat.fly().fly().eatHumans().attackTown().attackTown().attackTown();
    }
}
