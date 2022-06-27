package NestedLoop.MoreExercise;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                countCombination++;
                if ((i + j) == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", countCombination, magicNumber);
    }
}
