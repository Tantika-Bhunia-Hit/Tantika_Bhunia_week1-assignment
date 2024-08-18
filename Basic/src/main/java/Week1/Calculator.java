package Week1;

import java.util.Scanner;

public class Calculator 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter two numbers:");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();

	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");

	        int choice = scanner.nextInt();
	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return;
	        }

	        System.out.println("The result is: " + result);
	    }

}
