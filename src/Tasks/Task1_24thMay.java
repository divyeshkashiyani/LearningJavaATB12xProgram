package Tasks;

//Create a program that checks the grade a student receives and then gives a personalized message. The program should respond with:
//"Excellent" for grade A
//"Fail" for grade F
//And something like "Very good", "Good", "Needs improvement", or "Invalid grade" for other possible inputs

import java.util.Scanner;

public class Task1_24thMay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your School Grade = ");

        String input = scanner.next();

        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter a single character grade.");
        } else {
            char grade = input.toUpperCase().charAt(0); // Corrected this line

            switch (grade) {
                case 'A' -> System.out.println("Excellent! Keep it up.");
                case 'B' -> System.out.println("Very good! Well done.");
                case 'C' -> System.out.println("Good. You can do even better.");
                case 'D' -> System.out.println("Needs improvement. Try harder next time.");
                case 'F' -> System.out.println("Fail. Don’t give up, keep trying!");
                default -> System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
            }
        }

        scanner.close(); // Good practice
    }
}