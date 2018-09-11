public class ZooKeeperMammal {
    // private String name;
    private int energy;

    public ZooKeeperMammal(){
        // this.name = name;
        this.energy = 100;
    }

    public int getEnergy(){
        return this.energy;
    }

    // public String getName(){
    //     return this.name;
    // }

    public ZooKeeperMammal setEnergy(int val){
        this.energy = val;
        return this;
    }

    // public void setName(String name){
    //     this.name = name;
    // }
}