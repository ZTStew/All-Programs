import java.util.ArrayList;
public class ProjectClassDemo {                                                 // creates a class named, 'ProjectClassDemo'
    private String name;
    private String description;
    private float cost;

    public void MakeProject(){
        this.name = "No Name";
        this.description = "No Desciption";
        this.cost = 0;
    }

    public void MakeProject(String name){
        this.name = name;
        this.description = "No Desciption";
        this.cost = 0;
    }

    public void MakeProject(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public void MakeProject(String name, String description, float cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public ArrayList<Object> ElevatorPitch(){
        ArrayList<Object> elevatorList = new ArrayList<Object>();
        elevatorList.add(name);
        elevatorList.add(description);
        elevatorList.add(cost);
        return elevatorList;
    }
}
