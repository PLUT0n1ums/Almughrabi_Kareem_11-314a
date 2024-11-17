package HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();

        if (inputWord.equals("Hello")) {
            System.out.println("World!");
        } else {
            System.out.println("I don't know this command");
        }

        scanner.close();
    }
}