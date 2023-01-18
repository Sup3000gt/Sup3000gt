import java.util.Arrays;  // Import the Arrays class
import java.util.Scanner; // Import the Scanner class


/*
 * Topics covered:
 *      variable definition
 *      arrays, indexes, and accessing arrays
 *      for loops
 *      Input and Output from/to the system (Scanner and System.out.println)
 *      functions (briefly)
 *      classes (briefly)
 */

public class InClassJan13 {
    public static class Employee{           // Class for an Employee
        String name; int age;               // name and age are attributes on an Employee
        public Employee(String n, int a){   // constructor that allows us to define new Employees
            name = n;   // Sets this Employee's name to the one given when Employee was called
            age = a;    // Sets this Employee's age to the one given when Employee was called
        }
    }

    /*
     *  Notes about the records:
     *      They will only work if you have a new enough Java version (Java SE >= 14)
     *      You can comment it out if it doesn't work for you (put // at the beginning of line 32)
     *      A record is like a class, but has some stuff that you get for free (like a constructor or a .toEquals() method)
     *      If I can get the classroom computer updated and we are going to use these, I will go over them in class
     *      For now, here is what one looks like in case you want to ever use one or look it up yourself
     *      There is also videos about records in the link on the D2L news on the post named "Resource for Reviewing Java"
     */
    public static record EmployeeRecord(String name, int age){} //Record for an employee

    public static void main(String[] args){
        

        ////////////////////////////////////////
        //Find the max and the index of the max in arr
        ////////////////////////////////////////

        int arr [] = new int [5];                                   // Declare an int array of size 5
        arr[0] = 3; arr[1] = 2; arr[2] = 1; arr[3] = 2; arr[4] = 0; // put value into the array (indexes: 0, 1, 2, 3, 4)
        System.out.println("arr: "+Arrays.toString(arr));           // print the array
        System.out.println("arr[1]: "+arr[1]);                      // print the second value in the array (index 1)

        int max = 0;    // initialize a max (we are assuming all the values in the array are >= 0)
        int maxIdx = 0; // initialize a max index
        for(int i=0; i<arr.length; i++){    // loop through the indexes in the array (0 .. arr.length-1)
            if(arr[i]>max){                 // if the value at the current index is greater than the max
                max = arr[i];               //    we found a new max! update max
                maxIdx = i;                 //    update the index of the max too
            }
        }
        
        System.out.println("Max value: "+ max);         // print max value
        System.out.println("Index of max: "+ maxIdx);   // print max index

        //System.out.println(Math.max(arr));            // this will create an error - Math.max compares two values
        System.out.println(); // Spacing for nice output




        ////////////////////////////////////////
        // Count how many 3's are in an array
        ////////////////////////////////////////
        int [] arr2 = {1, 3, 2, 4, 3, 5, 6, 7, 5, 3}; // Initialize an array with the given values (answer = 3)
        int ct = threes(arr2);                        // use our function below to find the count
        System.out.println("New array: "+Arrays.toString(arr2));
        System.out.println("Count of 3's with function: "+ct);

        ct = 0;                             // Set ct to 0 so we can use it again
        for(int i=0; i<arr2.length; i++){   // loop through the indexes in arr2 (0 ..  arr2.length)
            if(arr2[i] == 3) ct ++;         //      if the value at the current index is equal to 3, increment ct
        }
        System.out.println("Without function: "+ct);

        System.out.println(); // White space
        



        ////////////////////////////////////////
        // Get a number from the user and print out how many values in the array are greater than that number
        ////////////////////////////////////////

        Scanner sc = new Scanner(System.in);
        int [] arr3 = {1, 3, 2, 4, 3, 5, 6, 7, 5, 3, 10, 1333456456, -2, 27};
        
        System.out.print("Please enter an integer: ");
        int val = sc.nextInt();         // read in next int
        // String s = sc.next();        // read in next hunk as a String
        // String ln = sc.nextLine();   // read in next line
        // double d = sc.nextDouble();  // read in next Double

        System.out.println("New Array: "+Arrays.toString(arr3));

        int count = 0;                  // initialize a counting variable
        for(int i = 0; i<arr3.length; i++){ // loop through the indexes in arr2 (0 ..  arr2.length)
            if(arr3[i] > val) count++;      // if the current value in arr3 is greater than val, increment count
        }
        System.out.println("Count with regular for loop: "+count);
        
        count = 0;                  // Set count to zero so we can use it again
        for(int n: arr3){           // for each int n in arr3 (This will give you each number in the array, and it will be stored in n)
            if(n > val) count++;    // if n is greater than val, increment count
        }

        System.out.println("Count with for each loop: "+count);
        sc.close();

    }

    // Function for finding the number of 3s in arr
    public static int threes(int [] arr){   // threes takes in an int array and returns an int
        int ct = 0;                         // Set ct to 0 so we can use it again
        for(int i=0; i<arr.length; i++){    // loop through the indexes in arr (0 ..  arr.length)
            if(arr[i] == 3) ct ++;          //      if the value at the current index is equal to 3, increment ct
        }
        return ct; // return the answer
    }
}
