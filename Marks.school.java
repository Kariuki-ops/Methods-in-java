package Marks.school;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Method to ask the lecturer to enter marks for each unit
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // A method to calculate the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Output the data
        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        // Close the scanner
        scanner.close();
    }
}