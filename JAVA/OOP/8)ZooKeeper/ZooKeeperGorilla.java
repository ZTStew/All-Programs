public class ZooKeeperGorilla extends ZooKeeperMammal {                         // creates 'ZooKeeperGorrilla' that extends 'ZooKeeperMammal'
    public ZooKeeperGorilla(){
    }

    public ZooKeeperGorilla throwThings(){
        // System.out.println(getEnergy());
        if(getEnergy() - 5 > 0){
            System.out.println("Throwing Stuff");
            setEnergy(getEnergy() - 5);
        } else {
            System.out.println("Too Tired.");
        }
        // System.out.println(getEnergy());
        return this;
    }

    public ZooKeeperGorilla eatBannana(){
        System.out.println("Nom, Nom, Nom.");
        // System.out.println(getEnergy());
        setEnergy(getEnergy() + 10);
        // System.out.println(getEnergy());
        return this;
    }

    public ZooKeeperGorilla climb(){
        // System.out.println(getEnergy());
        if(getEnergy() - 10 > 0){
            System.out.println("Climbing Stuff");
            setEnergy(getEnergy() - 10);
        } else {
            System.out.println("Too Tired.");
        }
        // System.out.println(getEnergy());
        return this;
    }
}