package one;
import java.util.Scanner;



public class WeekThree {

	public static int getSum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		
		// array to store numbers (int)
		int[] numbers = new int[2];
		
		for(int i = 0; i < 2;) {
			System.out.println("Enter number " + (i+1) + ": ");
			
			if(usrInput.hasNextInt()) {
				numbers[i] = usrInput.nextInt();
				i++; 
			} else {
				System.out.println("The number entered was not an int, try again: ");
				usrInput.next();
			}
		}
		
		int result = getSum(numbers[0], numbers[1]);
        System.out.println("The sum of the two numbers: " + numbers[0] + " and " + numbers[1] + " is: ");
        System.out.println(result);
		usrInput.close();
	}


}




