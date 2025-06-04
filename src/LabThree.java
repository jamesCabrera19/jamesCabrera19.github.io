package one;

public class LabThree {
//	public static void bin2Dec(String binaryString) {
//		int decimal = Integer.parseInt(binaryString, 2);
//		
//		System.out.println(decimal);
//		return;
//	}
//	public static void main(String[] args) {
//		System.out.println("Enter a string: " );
//
//		bin2Dec("hello");
//	}
	
}


class Testing{
	public static String checkBinary(String binaryString) {
		
		// loop to check for 0s and 1s in the string 
		for(int i = 0; i < binaryString.length(); i++ ) {
			char c = binaryString.charAt(i);
			if(c != '0' && c != '1' ) {
//				 System.out.println("Invalid char: " + c);
	            throw new NumberFormatException("INVALID BINARY STRING: " + binaryString);
			}
		}
		return binaryString;
	}
	public static void bin2Dec(String binaryString) {
		
		String binary = checkBinary(binaryString);
		
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(decimal);
		return;
	}
	public static void main(String[] args) {
		
		 try {
//		        bin2Dec("1010101v101010101");  // invalid
		        bin2Dec("1011");               // valid
		    } catch (NumberFormatException e) {
		        System.out.println("Error: " + e.getMessage());
		    }
	}
}