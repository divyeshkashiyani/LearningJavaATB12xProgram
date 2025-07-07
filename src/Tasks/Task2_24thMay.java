package Tasks;

// Task 2:
// Write a Java program that takes a month number (1-12) and prints the number of days in that month using a switch statement. Handle February separately for leap years.
// A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
// Input -> 1 to 12, and Year = 2025
// -> 1 and year 2025 -> 31 Days
// -> 2 and year 2025 -> 28 Days, (2025 leap)

import java.time.YearMonth;
import java.util.Scanner;

public class Task2_24thMay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year = ");

        if (!scanner.hasNextInt()) {
            System.out.println("❌ Invalid input. Year must be a numeric value.");
            scanner.close();
            return;
        }

        int year = scanner.nextInt();

        if (year < 0) {
            System.out.println("❌ Invalid year. Please enter a positive year (e.g., 2025).");
            scanner.close();
            return;
        }

        System.out.print("Enter Month = ");

        if (!scanner.hasNextInt()) {
            System.out.println("❌ Invalid input. Month must be a numeric value.");
            scanner.close();
            return;
        }

        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("❌ Invalid month. Please enter a value between 1 and 12.");
            scanner.close();
            return;
        }

        YearMonth ym = YearMonth.of(year, month);
        int daysInMonth = ym.lengthOfMonth();

        System.out.printf("✅ Year: %d%n✅ Month: %d%n📅 Days in month: %d%n", year, month, daysInMonth);

        scanner.close();
    }
}
