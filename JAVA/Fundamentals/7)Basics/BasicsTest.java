import java.util.ArrayList;                                                     // allows file to use arraylists
public class BasicsTest{                                                        // creates a class named, 'BasicsTest'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        BasicsDemo math = new BasicsDemo();                                     // creates an instace of, 'BasicsDemo' and named, 'math'
        int[] arr = {1,2,3,4,5};                                                // creates a dummy array
        int[] arr2 = {-1,-2,-3,-4,-5,0,1,2};                                    // creates a dummy array

        int solution1 = math.basic1(1, 255);                                    // creates a variable named, 'solution1' that uses the 'basic1' method of the 'math' object and sends values
        int solution2 = math.basic2(1, 255);                                    // creates a variable named, 'solution2' that uses the 'basic2' method of the 'math' object and sends values
        int solution3 = math.basic3(0, 255);                                    // creates a variable named, 'solution3' that uses the 'basic3' method of the 'math' object and sends values
        int solution4 = math.basic4(arr);                                       // creates a variable named, 'solution4' that uses the 'basic4' method of the 'math' object and sends values
        int solution5 = math.basic5(arr);                                       // creates a variable named, 'solution5' that uses the 'basic5' method of the 'math' object and sends values
        System.out.println("Max: " + solution5);
        int solution6 = math.basic6(arr);                                       // creates a variable named, 'solution6' that uses the 'basic6' method of the 'math' object and sends values
        System.out.println("Average: " + solution6);
        ArrayList<Integer> solution7 = math.basic7(1, 255);                     // creates a variable named, 'solution7' that uses the 'basic7' method of the 'math' object and sends values
        System.out.println(solution7);
        int solution8 = math.basic8(arr, 4);                                    // creates a variable named, 'solution8' that uses the 'basic8' method of the 'math' object and sends values
        System.out.println(solution8);
        int[] solution9 = math.basic9(arr);                                     // creates a variable named, 'solution9' that uses the 'basic9' method of the 'math' object and sends values
        int[] solution10 = math.basic10(arr2);                                  // creates a variable named, 'solution10' that uses the 'basic10' method of the 'math' object and sends values
        int[] solution11 = math.basic11(arr);                                   // creates a variable named, 'solution11' that uses the 'basic11' method of the 'math' object and sends values
        int[] solution12 = math.basic12(arr);                                   // creates a variable named, 'solution12' that uses the 'basic12' method of the 'math' object and sends values

    }
}

