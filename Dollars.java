import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an amount
        System.out.print("Enter the amount in dollars: ");
        int amount = scanner.nextInt();

        // Calculate the number of bills for each denomination
        int twenties = amount / 20;
        amount %= 20;

        int tens = amount / 10;
        amount %= 10;

        int fives = amount / 5;
        amount %= 5;

        int ones = amount;

        // Display the result
        System.out.println("The breakdown of the amount is:");
        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);

        // Close the scanner
        scanner.close();
    }
}
