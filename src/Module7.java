import java.util.Arrays;
import java.util.Random;

/**
 * Objective: Create a program that creates a array with random data and time it takes to sort the array
 * Algorithm: sorting 
 * Input and Output: none and string 
 * Created by: Jaime Cabrera
 * Date: July 22, 2025
 * Version: 1.0
 */


public class Module7 {
	
	// function to generate random numbers
	public static int[] getRandom(int size) {
		// initiating the random
		Random random = new Random();
		// array of int to store the numbers
		int[] numbers  = new int[size];
		
		// loop to fill the array
		for(int i =0 ; i < size;i++) {
			numbers[i] =  random.nextInt(1,100);
		}
		// returning the array
		return numbers;
	}
	
	
	
	public static void main(String[] args) {
		// array of sizes 
		int[] sizes =  {50000, 100000,150000,200000,250000,300000};
		
		// creating a basic table
		System.out.println("Array size" + "_".repeat(6) + "|" +"_".repeat(6)+"Sort time" );

		// loop to call the getRandom and to start a timer when sorting each array
		for(int i = 0; i < sizes.length; i++) {
			// current array of random numbers where size = sizes[i]
			int[] randomNumbers = getRandom(sizes[i]);
			
			// initiating the timer in milliseconds
			long startTime = System.currentTimeMillis();			

			// sorting current array
			Arrays.sort(randomNumbers);
			
			// ending the timer
			long endTime = System.currentTimeMillis();
			
			// calculating the time it took to sort the array
			long executionTime = endTime - startTime;
			
			// printing the result
			System.out.printf("%-15d | %-10d ms%n", sizes[i], executionTime);
		}
		
		
		
		
		
	}

}
