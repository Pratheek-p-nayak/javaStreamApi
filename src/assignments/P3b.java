package assignments;

import java.util.Scanner;

public class P3b {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the conversion (e.g., 'USD 2 to INR 150'):");
		        String input = scanner.nextLine();

		        // Parse input
		        String[] parts = input.split(" to ");
		        if (parts.length != 2) {
		            System.out.println("Invalid input format. Use 'Unit1 Value1 to Unit2 Value2'.");
		            return;
		        }

		        String[] leftParts = parts[0].split(" ");
		        String[] rightParts = parts[1].split(" ");

		        if (leftParts.length != 2 || rightParts.length != 2) {
		            System.out.println("Invalid input format. Use 'Unit1 Value1 to Unit2 Value2'.");
		            return;
		        }

		        try {
		            double leftValue = Double.parseDouble(leftParts[1]);
		            double rightValue = Double.parseDouble(rightParts[1]);
		            String leftUnit = leftParts[0];
		            String rightUnit = rightParts[0];

		            // Print original and reverse conversions
		            System.out.printf("1 %s = %.5f %s%n", leftUnit, rightValue / leftValue, rightUnit);
		            System.out.printf("1 %s = %.5f %s%n", rightUnit, leftValue / rightValue, leftUnit);

		        } catch (NumberFormatException e) {
		            System.out.println("Invalid numeric values in input.");
		        } finally {
		            scanner.close();
		        }
	}

}
