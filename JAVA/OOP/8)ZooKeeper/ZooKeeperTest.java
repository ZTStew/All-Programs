public class ZooKeeperTest {
    public static void main(String[] args) {                                    // creates an entry point method that expects no returns
        // ZooKeeperMammal animal = new ZooKeeperMammal();
        ZooKeeperGorilla gorilla = new ZooKeeperGorilla("Grod");
        ZooKeeperBat vampireBat = new ZooKeeperBat("Stingy");

        System.out.println(gorilla.getName());
        gorilla.throwThings().throwThings().eatBannana().throwThings().climb();
        System.out.println(vampireBat.getName());
        vampireBat.fly().fly().eatHumans().attackTown().attackTown().attackTown();
    }
}
