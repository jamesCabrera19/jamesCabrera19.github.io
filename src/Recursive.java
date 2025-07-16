
/**
 * Objective: 
 * Algorithm: lab 5 - recursive a method.
 * Input and Output: REcursive method for string reversals 
 * Created by: Jaime Cabrera
 * Date: July 10, 2025
 * Version: 1.0
 */


public class Recursive {

	
	public static void reverseDisplay(String value) {
		// base case -- return if value is null or does not have a length
		if(value == null || value.length()== 0 ) {
			return;
		}
		
		// storing the location of the last char in the string
		int i = value.length() - 1;
		
		// printing the last char of the string 
		System.out.print(value.charAt(i));

		// copy of the string
		String copy = value.substring(0, i);
		
		// passing the copied string to the function again
		reverseDisplay(copy);
		
		
	}
	
	// testing my for loop method against recursive Method
	public static void betterThanRecursive(String value) {

		for(int i = value.length()-1; i >=0; i--) {			
			System.out.print(value.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
	
		// test string
		String s = "abcdef";
		
		// my timer
        // long startRecursive = System.nanoTime();
		// calling the recursive method
		
		// calling the recursive method - way too slow
		reverseDisplay(s);
		
        // end of timer
//		long endRecursive = System.nanoTime();
//        
//        System.out.println("Recursive: " + (endRecursive - startRecursive) + " nano seconds");
//        
//        
//        long startLoop = System.nanoTime();
//        long endLoop = System.nanoTime();
//        System.out.println("Loop : " + (endLoop - startLoop) + " nano seconds");
    }

}
