package NestedLoop.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String current = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < current.length(); j++) {
                int digit = Integer.parseInt("" + current.charAt(j));
                if (j % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }

        }
    }
}
