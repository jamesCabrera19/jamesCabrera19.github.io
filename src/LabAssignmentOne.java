
import java.util.ArrayList;
import java.util.Scanner;

public class LabAssignmentOne {

    public static void counter() {
    	// user input
        Scanner usrInput = new Scanner(System.in);
        
        // number array to store user numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean isRunning = true;
        
        // Read numbers until 0 is entered
        while (isRunning != false) {
            System.out.print("Enter a number: ");
            
            if (usrInput.hasNextInt()) {
                int number = usrInput.nextInt();

                // If number is 0, add it to the array then break the loop
                if (number == 0) {
                    numbers.add(number);
                    isRunning = false;
                } else {
                    numbers.add(number);
                }
            }else {
            	usrInput.next(); 
                System.out.println("Please enter a valid integer.");

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

        System.out.println("Summary:");
        System.out.println("---".repeat(10));

        System.out.println("Negative values: " + negativeValues);
        System.out.println("Positive values: " + positiveValues);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        usrInput.close();
    }

    public static void main(String[] args) {
    	// calling the method
        counter();
    }
}