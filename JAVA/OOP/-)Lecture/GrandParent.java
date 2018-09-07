public class GrandParent {
    
    // public GrandParent(){}

    public static void main(String[] args){
        // cannot cast down a hirearchy chain
        GrandParent grandParent = new GrandParent();
        
        // Child child = (GrandParent)grandParent;
        Child child = new Child();
        GrandParent gp = (GrandParent)child;

        Parent p = (Parent)child;
    }
}