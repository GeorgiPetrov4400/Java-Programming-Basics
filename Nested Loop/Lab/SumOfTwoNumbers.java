package NestedLoop.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;

        for (int i = firstNumber; i <= lastNumber; i++) {
            for (int j = firstNumber; j <= lastNumber; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
