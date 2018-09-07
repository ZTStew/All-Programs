import java.util.ArrayList;                                                     // imports ArrayList so file can use it
public class ProjectClassDemo {                                                 // creates a class named, 'ProjectClassDemo'
    private String name;                                                        // creates a private vairable named, 'name'
    private String description;                                                 // creates a private vairable named, 'description'
    private float cost;                                                         // creates a private vairable named, 'cost'

    public void MakeProject(){ }                                                // makes a method named, 'MakeProject'

    public void MakeProject(String name){                                       // makes an overloaded method named, 'MakeProject' that accepts one variable
        this.name = name;                                                       // sets the 'name' of the current object to be the value of 'name'
    }

    public void MakeProject(String name, String description){                   // makes an overloaded method named, 'MakeProject' that accepts two variables
        this.name = name;                                                       // sets the 'name' of the current object to be the value of 'name'
        this.description = description;                                         // sets the 'description' of the current object to be the value of 'description'
    }

    public void MakeProject(String name, String description, float cost){       // makes an overloaded method named, 'MakeProject' that accepts three variables
        this.name = name;                                                       // sets the 'name' of the current object to be the value of 'name'
        this.description = description;                                         // sets the 'description' of the current object to be the value of 'description'
        this.cost = cost;                                                       // // sets the 'cost' of the current object to be the value of 'cost'
    }

    public ArrayList<Object> ElevatorPitch(){                                   // creates a method named, 'ElevatorPitch'
        ArrayList<Object> elevatorList = new ArrayList<Object>();               // creates an ArrayList of objects and names it, 'elevatorList'
        elevatorList.add(name);                                                 // adds to 'elevatorList' the value of 'name'
        elevatorList.add(description);                                          // adds to 'elevatorList' the value of 'description'
        elevatorList.add(cost);                                                 // adds to 'elevatorList' the value of 'cost'
        return elevatorList;                                                    // returns 'elevatorList'
    }
}
