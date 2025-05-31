package one;

import java.util.ArrayList;
import java.util.Scanner;

public class LabAssignmentOne {

    public static void counter() {
    	// user input
        Scanner usrInput = new Scanner(System.in);
        
        // number array to store user numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean isZero = true;
        
        // Read numbers until 0 is entered
        while (isZero != false) {
            System.out.print("Enter a number: ");
            int number = usrInput.nextInt();

            // if number is 0 we added to the array then break the loop
            if (number == 0) {
                numbers.add(number);
                isZero = false;
            } else {
                numbers.add(number);
            }
        }

        //
        System.out.println("Numbers entered: " + numbers);

        int negativeValues = 0; // keeps count of negative values
        int positiveValues = 0; // keeps count of positive values
        
        float sum = 0; // sum of all positive values

        // loop to count positive and negative values
        for (int i = 0; i < numbers.size(); i++) {
        	int current = numbers.get(i);
        	
        	if(current > 0) {
                 positiveValues++;
        	}else if(current < 0 ){
           	 	negativeValues++;
        	}
        	
        	sum += numbers.get(i);

        }

        // calculating average
        float average = (float) sum / numbers.size();

        System.out.println("\nSummary:");
        System.out.println("Negative values: " + negativeValues);
        System.out.println("Positive values: " + positiveValues);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        usrInput.close();
    }

    public static void main(String[] args) {
        counter();
    }
}