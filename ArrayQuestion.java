import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];
        
        // This asks the user to enter 15 random integers
        System.out.println("Enter 15 integers:");
        for (int N = 0; N < 15; N++) {
            array[N] = scanner.nextInt();
        }
        // (A) Print the values stored in the array on screen 
        System.out.println("The values in the array are as follows:");
        for (int F = 0; F < 15; F++) {
            System.out.print(array[F] + " ");
        }
        System.out.println();


        // (B) Check if a user-specified number is present in the array
        System.out.println("Enter a number to check if it's in the array:");
        int numberChecker = scanner.nextInt();
        boolean found = false;
        for (int B = 0; B < 15; B++) {
            if (array[B] == numberChecker) {
                System.out.println("The number found at index " + B);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // (C) An arrray that displays the stored values but in reverse
        int[] reversedArray = new int[15];
        for (int N = 0; N < 15; N++) {
            reversedArray[N] = array[14 - N];
        }
        System.out.println("The values in the reversed array are:");
        for (int N = 0; N < 15; N++) {
            System.out.print(reversedArray[N] + " ");
        }
        System.out.println();

        // d) Get the sum and product of all elements in the array
        int sum = 0;
        long product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
        
        scanner.close();
}
}