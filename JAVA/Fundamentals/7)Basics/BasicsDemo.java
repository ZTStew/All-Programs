import java.util.ArrayList;                                                     // allows file to use arraylists
public class BasicsDemo {                                                       // creates a class named, 'BasicsDemo'
    public int basic1(int num1, int num2){                                      // creates a method named, 'basic1' that accepts two variables
        int[] arr = new int[num2 - num1 + 2];                                   // creates an array named, 'arr' with a range of the difference between the two values plus 2
        for(int i = num1; i <= num2; i++){                                      // creates a for loop that goes through the values within the two values
            arr[i] = i;                                                         // sets the current 'i' value to be equal to the arr[i]
        }
        for(int j = 0; j < arr.length; j++){                                    // creates a for loop that goes through all the indices of 'arr' 
            System.out.println(arr[j]);                                         // logs each value found
        }
        return 0;                                                               // returns a value
    }

    public int basic2(int num1, int num2){                                      // creates a method named, 'basic2' that accepts two variables
        for(int i = num1; i <= (num2 - num1 + 1); i++){                         // creates a for loop that goes the differece between the two values
            if(i % 2 == 1){                                                     // if the number is odd...
                System.out.println(i);                                          // print the number
            }
        }
        return 0;                                                               // returns a value
    }

    public int basic3(int num1, int num2){                                      // creates a method named, 'basic3' that accepts two variables
        int sum = 0;                                                            // creates a variable named, 'sum' and sets it to 0
        for(int i = num1; i <= (num2 - num1 + 1); i++){                         // creates a for loop that goes the differece between the two values
            sum += i;                                                           // increases the total value of sum
            System.out.println(sum);                                            // prints the value of 'sum'
        }
        return sum;                                                             // returns 'sum'
    }

    public int basic4(int[] arr){                                               // creates a method named, 'basic4' that accepts two variables
        for(int i = 0; i < arr.length; i++){                                    // for loop to iterate through the values in arr
            System.out.println(arr[i]);                                         // prints the value found in 'arr' at the 'i' index
        }
        return 0;                                                               // returns a valued
    }

    public int basic5(int[] arr){                                               // creates a method named, 'basic5' that accepts two variables
        int max = arr[0];                                                       // creates a variable named, 'max' and sets it equal to the first index of 'arr'
        for(int i = 0; i < arr.length; i++){                                    // for loop to iterate through the values in arr
            if(arr[i] > max){                                                   // if the index is greater than 'max'...
                max = arr[i];                                                   // sets 'max' equal to the index
            }
        }
        return max;                                                             // returns a valued
    }

    public int basic6(int[] arr){                                               // creates a method named, 'basic6' that accepts two variables
        int sum = 0;                                                            // creates a variable named, 'sum' and sets it to 0
        for(int i = 0; i < arr.length; i++){                                    // for loop to iterate through the values in arr
            sum += arr[i];                                                      // adds to the value of 'sum' the value of the current index
        }
        return sum / arr.length;                                                // returns the sum divided by the length of arr
    }

    public ArrayList<Integer> basic7(int num1, int num2){                       // creates a method named, 'basic7' that accepts two variables and will return an arraylist of integers
        ArrayList<Integer> arr = new ArrayList<Integer>();                      // creates a new arraylist named, 'arr'
        for(int i = num1; i <= num2; i++){                                      // creates a for loop to go though the range of 'num1' and 'num2'
            if(i % 2 == 1){                                                     // if the value of 'i' is odd...
                arr.add(i);                                                     // add the value of 'i' into the 'arr' object
            }
        }
        return arr;                                                             // return the 'arr' object
    }

    public int basic8(int[] arr, int y){                                        // creates a method named, 'basic8' that accepts two variables
        int total = 0;                                                          // creates a variable named 'total' and sets it equal to 0
        for(int i = 0; i < arr.length; i++){                                    // for loop that goes through each index of an arr
            if(arr[i] < y){                                                     // if the current index of 'arr' is less than 'y'...
                total++;                                                        // increase total by one
            }
        }
        return total;                                                           // return total
    }

    public int[] basic9(int[] arr){                                             // creates a method named, 'basic9' that accepts an array
        for(int i = 0; i < arr.length; i++){                                    // iterates through all the values in 'arr'
            arr[i] = arr[i] * arr[i];                                           // squares the current index of 'arr'
            System.out.println(arr[i]);                                         // logs the now squared values of the 'arr'
        }
        return arr;                                                             // returns the arr
    }

    public int[] basic10(int[] arr){                                            // creates a method named, 'basic10' that accepts an array
        for(int i = 0; i < arr.length; i++){                                    // iterates through all the values in 'arr'
            if(arr[i] < 0){                                                     // if the current index of 'arr' is negative...
                arr[i] = 0;                                                     // set the current index of 'arr' to be 0
            }
            System.out.println(arr[i]);                                         // logs the new value of each index
        }
        return arr;                                                             // returns the arr
    }

    public int[] basic11(int[] arr){                                            // creates a method named, 'basic11' that accepts an array
        int[] newArr = new int[3];                                              // creates a new array named, 'newArr'
        int min = arr[0];                                                       // creates a new variable named, 'min' and sets it equal to the first index in 'newArr'
        int max = arr[0];                                                       // creates a new variable named, 'max' and sets it equal to the first index in 'newArr'
        int sum = 0;                                                            // creates a new variable named, 'sum' and sets it equal to 0
        for(int i = 0; i < arr.length; i++){                                    // for loop to interate through the indecies of newArr
            if(max < arr[i]){                                                   // if 'max' is less than the current index...
                max = arr[i];                                                   // sets 'max' equal to the current index
            } else if(min > arr[i]){                                            // else if 'min' is greater than the current index...
                min = arr[i];                                                   // sets 'min' equal to the current index
            }
            sum += arr[i];                                                      // adds the current indecies value to 'sum'
        }
        int avg = sum / arr.length;                                             // creates a new variable named, 'avg' and sets it equal to the sum divided by the total length of 'arr'
        newArr[0] = min;                                                        // assigns 'min' to an index in 'newArr'
        newArr[1] = max;                                                        // assigns 'max' to an index in 'newArr'
        newArr[2] = avg;                                                        // assigns 'avg' to an index in 'newArr'

        for(int j = 0; j < newArr.length; j++){                                 // loops through 'newArr'
            System.out.println(newArr[j]);                                      // prints the value of the current index
        }

        return newArr;                                                          // returns 'newArr'
    }

    public int[] basic12(int[] arr){                                            // creates a method named, 'basic12' that accepts an array
        for(int i = 0; i < arr.length - 1; i++){                                // loops through 'arr'
            arr[i] = arr[i + 1];                                                // sets each index to the the index in front of it
        }
        arr[arr.length-1] = 0;                                                  // sets the last index to be equal to 0
        for(int i = 0; i < arr.length; i++){                                    // loops through 'arr'
            System.out.println(arr[i]);                                         // prints the current index
        }
        return arr;                                                             // returns the arr
    }
}
