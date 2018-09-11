/*
 * An application to practice using Hash Maps
 *
 * @author Stewart
 * @version JAVA 8, 9/6/2018
 */

import java.util.HashMap;                                                       // allows file to use HashMaps
import java.util.Set;                                                           // allows file to use Set
public class MapsTest {                                                         // creates a class named, 'MapsTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        /*
        HashMap<String, String> userMap = new HashMap<String, String>();        // creates a HashMap named, 'userMap'
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");                    // puts into 'userMap' a key, value pair
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");                  // puts into 'userMap' a key, value pair

        String name = userMap.get("nninja@codingdojo.com");                     // creates a variable named, 'name' and assigns the value to what is returned when a key is requested from the 'userMap' HashMap

        System.out.println(name);                                               // prints 'name'
        */

        HashMap<String, String> trackList = new HashMap<String, String>();      // creates a new HashMap named, 'trackList'
        trackList.put("Song No.1", "I does song");                              // puts values into 'trackList'
        trackList.put("Song No.2", "I does another song");                      // puts values into 'trackList'
        trackList.put("Song No.3", "I does new song");                          // puts values into 'trackList'
        trackList.put("Song No.4", "I does different song");                    // puts values into 'trackList'
        trackList.put("Song No.5", "I does generic song");                      // puts values into 'trackList'

        String track = trackList.get("Song No.1");                              // creates a varaible named, 'track' that is equal to the matching string found as a key in 'trackList'
        System.out.println(track);                                              // prints 'track'
    
        Set<String> keys = trackList.keySet();                                  // Sets a variable, 'keys' to be equal to 'trackList' 'keySet' method
        for(String key : keys){                                                 // loops through all the 'key' in 'keys'
            System.out.println(key);                                            // prints 'key'
            System.out.println(trackList.get(key));                             // prints the value that matches 'key' in trackList
        }
    }
}
