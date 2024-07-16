import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a year: ");
        int year = scanner.nextInt();


        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //First part checks if the year is divisible by 4
        //Second part checks if the year is divisible by 400
        
    }
}
