package NestedLoop.MoreExercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimitFirstNumber = Integer.parseInt(scanner.nextLine());
        int upperLimitSecondNumber = Integer.parseInt(scanner.nextLine());
        int upperLimitThirdNumber = Integer.parseInt(scanner.nextLine());

        //Първата и третата цифра трябва да бъдат четни.
        //Втората цифра трябва да бъде просто число в диапазона [2...7].

        for (int i = 1; i <= upperLimitFirstNumber; i++) {
            for (int j = 2; j <= upperLimitSecondNumber; j++) {
                for (int k = 1; k <= upperLimitThirdNumber; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d% d%n", i, j, k);
                    }
                }
            }
        }
    }
}
