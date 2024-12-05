package task01;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = num1; // Assume the first number is the smallest

        if (num2 < smallest) {
            smallest = num2; // Update smallest if the second number is smaller
        }

        if (num3 < smallest) {
            smallest = num3; // Update smallest if the third number is smaller
        }

        // Display the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}