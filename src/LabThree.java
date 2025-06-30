
public class LabThree {
	
	// method to check String
	public static String checkBinary(String binaryString) {
		
		// loop to check for 0s and 1s in the string 
		for(int i = 0; i < binaryString.length(); i++ ) {
			// grabbing the first char of the string
			char current = binaryString.charAt(i);
			
			// checking the current Char. if current char is not a 0 or 1 throw error
			if(current != '0' && current != '1' ) {
//				 System.out.println("Invalid char: " + c);
	            throw new NumberFormatException("INVALID BINARY STRING: " + binaryString);
			}
		}
		// returning the string if it passes the check
		return binaryString;
	}
	public static int bin2Dec(String binaryString) {
		// checking and storing the binary string
		String binary = checkBinary(binaryString);
		
		// parsing the string to int base
		int decimal = Integer.parseInt(binary, 2);
		
		return decimal;
	}
	public static void main(String[] args) {
		// array of strings -
		String[] nums = {"1011", "1111111111111","101010101010101a11"};
		
		// loop to call validation method
		for (String binary : nums) {
            try {
            	// storing current sting string in result variable
                int result = bin2Dec(binary);
                System.out.println(result + " is Valid");
            } catch (NumberFormatException e) {
            	// printing num and error if current string is invalid 
                System.out.println("Error: " + e.getMessage());
            }
        }
		 
	}
}
