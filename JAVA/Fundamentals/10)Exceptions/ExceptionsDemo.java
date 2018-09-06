import java.util.ArrayList;

public class ExceptionsDemo {
    public String exList(){
        ArrayList<Object> theList = new ArrayList<Object>();
        theList.add("13");
        theList.add("hello world");
        // theList.add(48);
        theList.add("Goodbye World");

        for(int i = 0; i < theList.size(); i++){
            try {
                // String foundValue = (String) theList.get(i);
            } catch (cast e) {
                Integer foundValue = (Integer) theList.get(i);
            }
            
            System.out.println(foundValue);
        }

        return null;
    }
}