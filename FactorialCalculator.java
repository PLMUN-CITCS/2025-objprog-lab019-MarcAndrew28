import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get a valid number from the user
        int factorial = calculateFactorial(number); // Calculate factorial
        System.out.println("the factorial of: " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner cram = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a non-negative integer: ");

            while (!cram.hasNextInt()) { // Check for non-integer input
                System.out.print("Invalid input. Enter a non-negative integer: ");
                cram.next(); // Discard invalid input
            }

            n = cram.nextInt();

            if (n < 0) { // Ensure input is non-negative
                System.out.println("Number must be non-negative. Try again.");
            }

        } while (n < 0);

        cram.close(); // Close scanner to prevent resource leak
        return n;
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
