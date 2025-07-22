package one;
import java.util.Scanner;


public class Week8 {

	public static String getUsrInput(Scanner scanner) {

		
		System.out.println("Enter a phrase: ");
		return scanner.nextLine();
		
		
		
	}
	
	
	public static void reverseDisplay(String value) {
		// base case
		if(value == null || value.length() == 0) {
			return;
		}
		
		
		int lastCharLocation = value.length()-1;		
		String copy = value.substring(0, lastCharLocation);
		System.out.print(value.charAt(lastCharLocation));
		
		reverseDisplay(copy);
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		String p = getUsrInput(scanner);
//		System.out.println(p);
		
		reverseDisplay(p);
		
		scanner.close();

	}

}
