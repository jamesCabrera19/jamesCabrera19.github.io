

/**
 * Objective: Create a program that reads a file from the system.
 * Algorithm: file reader with string and int validation. 
 * Input and Output: ints and string prints a string
 * Created by: Jaime Cabrera
 * Date: July 16, 2025
 * Version: 1.0
 */


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class ModuleSix {
	
	public static void textReader( int year, String gender, String name) {
		// MY LOCAL PATH - UPDATE PATH WITH YOURS
        String path = "/Users/james/Downloads/names/yob" + year + ".txt";
       
        // variable to save name if found
        String foundName = "";
        
        // try check
        try {
        	// looking for the file - AGAIN: CHECK YOUR PATH 
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            // loop to print lines
            while (scanner.hasNextLine()) {
            	// accessing the lines
                String line = scanner.nextLine();

               // check to see if the current line contains the Name and Gender
                if (line.contains(name) && line.contains(gender) ) {
                	// Printing Possible Matches	
//                    System.out.println(line);
                	
                	// if found we update the foundName variable and exit the loop
                    foundName = line;
                    // exiting the loop early
                    break;
                }
            }
            
            // closing the scanner to avoid memory leaks
            scanner.close();
            
            // catch exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            // printing error
            e.printStackTrace();
        }
        
        
        //check to ensure that we found our name 
        if(foundName.length() > 0) {
        	// splitting the array - split method creates array of strings
        	String[] splittedName = foundName.split(",");
        	
        	// accessing the first item in the array - this is our name
            String n = splittedName[0];
            
            // getting the rank
            int rank = Integer.parseInt(splittedName[2]);
            
            // printing the result
            System.out.println(n + " is ranked #" +rank + " in year " + year);
        }else {
        	// if no names are found this is our message!
            System.out.println("The name: " + name + " is not ranked in year: " + year);

        }
        
    }
	
	// int validation method - ensures only ints longer than 2000 and less that 2025 are entered
    public static int validateInt(Scanner scanner) {
        int year = 0;
        boolean validYear = false;

        while (!validYear) {
            System.out.println("Enter the year: ");
            // int check
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                // double check to ensure we are within text file boundaries
                if (year > 2000 && year < 2025) {
                    validYear = true;
                }
            } else {
                System.out.println("The number entered was not an int, try again.");
            }
            scanner.nextLine();
        }
        // validated year
        return year;
    }

    // method to validate the gender - it only allows for F or M strings (not chars. I know i have to optimize my code but i was in a rush )
    public static String validateGender(Scanner scanner) {
        String gender = "";
        boolean isValid = false;
        
        // loop
        while (!isValid) {
            System.out.println("Enter the gender M/F: ");
            gender = scanner.nextLine().toUpperCase().trim();

            // checking if the input contains a M or F to continue.
            if (gender.equals("M") || gender.equals("F")) {
                isValid = true;
            } else {
                System.out.println("The gender entered was not F or M, try again.");
            }
        }

        return gender;
    }

    // method to validate name. it validates the name by checking its length
    public static String validateName(Scanner scanner) {
        boolean isValid = false;
        String name = "";

        // loop
        while (!isValid) {
            System.out.println("Enter the name: ");
            name = scanner.nextLine().trim();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            // simple check to ensure that a name was entered
            if (name.length() > 0) {
                isValid = true;
            } else {
                System.out.println("Enter a correct name");
            }
        }
        // returning validated name
        return name;
    }

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Don't forget to change the path in textReader()!"); 
        // only years more than 2000 and less than 2025
        int year = validateInt(scanner);

        // allows for M or F chars only - returns a string
        String gender = validateGender(scanner);

        // doesn't allow empty names
        String name = validateName(scanner);
     
        // calling the method
        textReader(year,gender,name);
        
        // closing the scanner to avoid memory leaks
        scanner.close();
    }
}


