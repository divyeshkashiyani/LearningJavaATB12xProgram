package Tasks;

//Use the ternary operator, nested ternary operator.
// If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

public class Task2_17thMay {
    public static void main(String[] args) {

        int num1 = 23, num2 = 7, num3 =  15;

        String Result = (num1 > num2 ? (num1 > num3 ? "mum1 is big" : "num3 is big")
                : (num2 > num3 ? "num2 is big" : "num3 is big"));

        System.out.println(Result);
    }
}