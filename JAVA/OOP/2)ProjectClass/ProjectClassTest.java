/*
 * An application to practice overloading in JAVA, can create people and then assign them, nothing, just a name, a name and, a description, or a name, a description and, a cost to employ
 *
 * @author Stewart
 * @version JAVA 8, 9/7/2018
 */

import java.util.ArrayList;                                                     // imports ArrayList so file can use it
public class ProjectClassTest {                                                 // creates an class named, 'ProjectClassTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        ProjectClassDemo person1 = new ProjectClassDemo();                      // creates an instance of, 'ProjectClassDemo' and named it, 'person1'
        ProjectClassDemo person2 = new ProjectClassDemo();                      // creates an instance of, 'ProjectClassDemo' and named it, 'person2'
        ProjectClassDemo person3 = new ProjectClassDemo();                      // creates an instance of, 'ProjectClassDemo' and named it, 'person3'
        ProjectClassDemo person4 = new ProjectClassDemo();                      // creates an instance of, 'ProjectClassDemo' and named it, 'person4'

        person1.MakeProject();                                                  // uses the 'MakeProject' method of 'person1' and gives it nothing
        person2.MakeProject("Nate");                                            // uses the 'MakeProject' method of 'person2' and gives it only a name
        person3.MakeProject("Nate", "I does Cheese Cake");                      // uses the 'MakeProject' method of 'person3' and gives it a name and a description
        person4.MakeProject("Nate", "I does Cheese Cake", 70000);               // uses the 'MakeProject' method of 'person4' and gives it a name, a description and a cost

        ArrayList<Object> pitch1 = person1.ElevatorPitch();                     // creates a variable named, 'pitch1' and sets it equal to the return of the 'ElevatorPitch' method found in 'person1'
        ArrayList<Object> pitch2 = person2.ElevatorPitch();                     // creates a variable named, 'pitch2' and sets it equal to the return of the 'ElevatorPitch' method found in 'person2'
        ArrayList<Object> pitch3 = person3.ElevatorPitch();                     // creates a variable named, 'pitch3' and sets it equal to the return of the 'ElevatorPitch' method found in 'person3'
        ArrayList<Object> pitch4 = person4.ElevatorPitch();                     // creates a variable named, 'pitch4' and sets it equal to the return of the 'ElevatorPitch' method found in 'person4'

        System.out.println(pitch1);                                             // prints the value of 'pitch1'
        System.out.println(pitch2);                                             // prints the value of 'pitch2'
        System.out.println(pitch3);                                             // prints the value of 'pitch3'
        System.out.println(pitch4);                                             // prints the value of 'pitch4'
    }
}
