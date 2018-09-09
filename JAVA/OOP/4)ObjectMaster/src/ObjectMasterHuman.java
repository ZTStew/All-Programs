public class ObjectMasterHuman {
    private int health = 100;
    private int strength = 3;
    private int intelligence = 3;
    private int stealth = 3;

    public void getStats(){
        System.out.println("Health is: " + health);
        System.out.println("Strength is: " + strength);
        System.out.println("Intelligence is: " + intelligence);
        System.out.println("Stealth is: " + stealth);

        return;
    }

    public int getHP(){
        return health;
    }

    public int getStr(){
        return strength;
    }

    public int getInt(){
        return intelligence;
    }

    public int getStealth(){
        return stealth;
    }

    public void setHP(int hp){
        health = hp;
    }

    public void setStr(int str){
        strength = str;
    }

    public void setInt(int intell){
        intelligence = intell;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public ObjectMasterHuman attack(ObjectMasterHuman target){
        
        target.setHP(target.getHP() - getStr());

        System.out.println("You attacked your target for, " + getStr() + " damage and have left your target with, " + target.getHP() + " health.");
        return target;

    }

    public void buffHP(){
        setHP(getHP() + 10);
    }
    public void buffStr(){
        setStr(getStr() + 1);
    }
    public void buffInt(){
        setInt(getInt() + 1);
    }
    public void buffStealth(){
        setStealth(getStealth() + 1);
    }
}
