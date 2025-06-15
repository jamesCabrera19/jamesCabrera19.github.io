import java.util.Scanner;
/**
 * Objective: Create a program that checks and validates int values.
 * Algorithm: Create a int validation system. 
 * Input and Output: two int values, a single int value 
 * Created by: Jaime Cabrera
 * Date: June 15, 2025
 * Version: 1.0
 */


public class WeekThree {

	// method to get the sum of X + Y. 
    public static int getSum(int x, int y) {
    	//returns int
        return x + y;
    }
    
    // method to read, store, and check int values
    public static int[] getInput(Scanner usrInput ) {
        // Array to store two numbers only
        int[] numbers = new int[2];

        // loop to get x and y values
        for (int i = 0; i < 2; ) {
            System.out.print("Enter number " + (i + 1) + ": ");

            // int validation check
            if (usrInput.hasNextInt()) {
            	// storing the value in the array
                numbers[i] = usrInput.nextInt();
                System.out.println("Value: " +  numbers[i] + " is Correct.");
               
                ////// WE ONLY GO TO THE NEXT ITERATION IF usrInput.hasNextInt() IS TRUE //////
                i++;
            } else {
                System.out.println("The number entered was not an int, try again.");
                // getting again the input
                usrInput.nextLine();
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
    	// initializing the scanner object
        Scanner usrInput = new Scanner(System.in);

        // calling the method getInput to read, store and validate input
        int[] values = getInput(usrInput);
        
        // extracting the values for readability
        int x = values[0];
        int y = values[1];
        
        // printing the values x and y
        System.out.println("The sum of the two numbers " + values[0] + " and " + values[1] + " is:");

        // calling the method getSum - returns sum of x + y
        int result = getSum(x, y);
        
        // printing the result
        System.out.println(result);

        // closing the Scanner object to avoid memory leaks
        usrInput.close();
    }
}