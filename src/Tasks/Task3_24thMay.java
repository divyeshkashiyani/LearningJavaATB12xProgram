package Tasks;

// Task 3: Factorial for n = user will enter the n from 0 to Max(int)

import java.util.Scanner;

public class Task3_24thMay {
    public static void main(String[] args) {

        int fact = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");

        if (!scanner.hasNextInt()) {
            System.out.println("❌ Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }

        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("❌ Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.printf("✅ Factorial of %d is: %d%n", num, fact);
        }

        scanner.close();
    }
}

