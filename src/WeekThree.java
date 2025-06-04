package one;

import java.util.Scanner;

public class WeekThree {

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static int getInput(Scanner usrInput) {
        // Array to store numbers
        int[] numbers = new int[2];

        // loop to get values 1,2
        for (int i = 0; i < 2; ) {
            System.out.print("Enter number " + (i + 1) + ": ");

            if (usrInput.hasNextInt()) {
                numbers[i] = usrInput.nextInt();
                // only going to the next iteration if a valid value is entered
                i++;
            } else {
                System.out.println("The number entered was not an int, try again.");
                usrInput.next(); // consume next token
            }
        }

        System.out.println("The sum of the two numbers " + numbers[0] + " and " + numbers[1] + " is:");

        return getSum(numbers[0], numbers[1]);
    }

    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);

        System.out.println(getInput(usrInput));

        usrInput.close();
    }
}