import java.util.ArrayList;
public class ProjectClassTest {                                                 // creates an class named, 'ProjectClassTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        ProjectClassDemo person1 = new ProjectClassDemo();
        ProjectClassDemo person2 = new ProjectClassDemo();
        ProjectClassDemo person3 = new ProjectClassDemo();
        ProjectClassDemo person4 = new ProjectClassDemo();

        person1.MakeProject();
        person2.MakeProject("Nate");
        person3.MakeProject("Nate", "I does Cheese Cake");
        person4.MakeProject("Nate", "I does Cheese Cake", 70000);

        ArrayList<Object> pitch1 = person1.ElevatorPitch();
        ArrayList<Object> pitch2 = person2.ElevatorPitch();
        ArrayList<Object> pitch3 = person3.ElevatorPitch();
        ArrayList<Object> pitch4 = person4.ElevatorPitch();

        System.out.println(pitch1);
        System.out.println(pitch2);
        System.out.println(pitch3);
        System.out.println(pitch4);
    }
}
