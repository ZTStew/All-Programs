public class ZooKeeperBat extends ZooKeeperMammal {

    public ZooKeeperBat(String name){
        setName(name);
        setEnergy(300);
    }

    public ZooKeeperBat fly(){
        // System.out.println(getEnergy());
        if(getEnergy() - 50 > 0){
            System.out.println(getName() + " Flew.");
            setEnergy(getEnergy() - 50);
        } else {
            System.out.println("Too Tired.");
        }
        // System.out.println(getEnergy());
        return this;
    }

    public ZooKeeperBat eatHumans(){
        System.out.println("Crunch, Crunch, Crunch.");
        // System.out.println(getEnergy());
        setEnergy(getEnergy() + 25);
        // System.out.println(getEnergy());
        return this;
    }

    public ZooKeeperBat attackTown(){
        // System.out.println(getEnergy());
        if(getEnergy() - 100 > 0){
            System.out.println("Ahhh.");
            setEnergy(getEnergy() - 100);
        } else {
            System.out.println("Too Tired.");
        }
        // System.out.println(getEnergy());
        return this;
    }

}