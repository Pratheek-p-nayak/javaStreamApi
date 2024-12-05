package assignments;

import java.io.*;
import java.util.Scanner;

public class P3a {

	public static void main(String[] args) {
		String inputFile = "inConvert.txt";
        String outputFile = "outConvert.txt";

        try (Scanner scanner = new Scanner(new File(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");

                if (parts.length != 2) {
                    System.out.println("Invalid format in line: " + line);
                    continue;
                }

                String left = parts[0].trim();
                String right = parts[1].trim();

                String[] leftParts = left.split(" ");
                String[] rightParts = right.split(" ");

                if (leftParts.length != 2 || rightParts.length != 2) {
                    System.out.println("Invalid format in line: " + line);
                    continue;
                }

                double leftValue = Double.parseDouble(leftParts[0]);
                double rightValue = Double.parseDouble(rightParts[0]);
                String leftUnit = leftParts[1];
                String rightUnit = rightParts[1];

                // Write original conversion
                writer.write(line + "\n");

                // Write reverse conversions
                writer.write(String.format("1 %s = %.5f %s%n", rightUnit, 1.0 / rightValue, leftUnit));
                writer.write(String.format("1 %s = %.5f %s%n", leftUnit, 1.0 / leftValue, rightUnit));
            }

            System.out.println("Conversions written to " + outputFile);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}

}