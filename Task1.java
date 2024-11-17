package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();

        float sum = firstNumber + secondNumber;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}