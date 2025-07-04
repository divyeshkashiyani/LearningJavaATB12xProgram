package Tasks;

// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
// or scalene (no sides are equal). Use an if-else statement to classify the triangle.

import java.io.PrintStream;
import java.util.Scanner;

public class Task19thMay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Triangle value =");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Triangle value =");
        int num2 = scanner.nextInt();
        System.out.print("Enter the Third Triangle value =");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("Triangle is Equilateral");
        } else if (num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("Triangle is Isosceles");
        }else {
            System.out.println("Triangle is Scalene");
        }
    }
}