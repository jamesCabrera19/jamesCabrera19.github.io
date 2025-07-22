import java.util.Arrays;
import java.util.Random;

public class Module7 {
	
	// function to generate random numbers
	public static int[] getRandom(int size) {
		Random random = new Random();
		int[] numbers  = new int[size];
		
		for(int i =0; i < size;i++) {
			numbers[i] =  random.nextInt(1,100);
		}
		
		return numbers;
	}
	
	
	
	public static void main(String[] args) {
		int[] sizes =  {50000, 100000,150000,200000,250000,300000};
		
		
		System.out.println("Array size" + "_".repeat(6) + "|" +"_".repeat(6)+"Sort time" );

		for(int i = 0; i < sizes.length; i++) {
			int[] randomNumbers = getRandom(sizes[i]);
			
			long startTime = System.currentTimeMillis();			

			// sorting current array
			Arrays.sort(randomNumbers);			
			long endTime = System.currentTimeMillis();
//
			long executionTime = endTime - startTime;
			System.out.printf("%-15d | %-10d ms%n", sizes[i], executionTime);
		}
		
		
		
		
		
	}

}
