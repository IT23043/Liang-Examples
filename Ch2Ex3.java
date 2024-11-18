import java.util.*;

public class Ch2Ex3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute the average
        double average = (number1 + number2 + number3) / 3;

        // Display the results
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is " + average);
    }
}