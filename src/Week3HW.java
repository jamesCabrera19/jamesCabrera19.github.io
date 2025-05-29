

import java.util.Scanner;
public class Week3HW {

	public static int getSum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usrInput = new Scanner(System.in);
		
		
		int[] numbers = new int[2];
		for(int i = 0; i < 2;) {
			System.out.println("enter a number: ");
			
			
			if(usrInput.hasNextInt()) {
				int n =  usrInput.nextInt();
				numbers[i] = n;
				i++; 
			} else {
				System.out.println("enter a valid number: ");
				usrInput.next();
			}
		}
		
		int res = getSum(numbers[0], numbers[1]);
        System.out.println("Sum: " + res);
		usrInput.close();
	}

}
