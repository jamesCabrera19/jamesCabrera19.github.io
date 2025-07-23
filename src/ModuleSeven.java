package one;

import java.util.Arrays;
import java.util.Random;

public class ModuleSeven {

	
	// method to create random data array
	public static int[] getRandomData(int size) {
		// initiating the random
		Random random = new Random();
		
		// data array
		int[] data = new int[size];
		
		// loop to fill data array
		for(int i = 0; i < size; i++) {
			// filling up every index of the data array with a random number
			data[i] = random.nextInt(0,101);
		}
		// returning the data
		return data;
	}
	
	

	
	public static void main(String[] args) {

		int[] arraySizes = {50000,100000,150000,200000,250000,300000};
		
		System.out.println("Array Size " + " | " + "Sorting Time ");

		for(int i = 0; i< arraySizes.length; i++) {
			// creating array of data
			int[] data = getRandomData(arraySizes[i]);
			// starting the timer
			long startTime = System.currentTimeMillis();
			// sorting the data array
			Arrays.sort(data);
			// ending the timer
			long endTime = System.currentTimeMillis();
			
			//calculating time for the sort
			long executionTime = endTime - startTime;
			
			System.out.println(data.length + " | " + executionTime + " milliseconds " );
		}
		
		
	}

}
