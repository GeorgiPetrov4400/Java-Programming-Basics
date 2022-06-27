package NestedLoop.MoreExercise;

import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxNumberPassword = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;

        for (int i = 35; i <= 55; i++) {
            for (int j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        countCombinations++;

                        System.out.printf("%c%c%d%d%c%c|", (char) i, (char) j, k, l, (char) j, (char) i);

                        if (countCombinations == maxNumberPassword) {
                            return;
                        }
                        i++;
                        j++;

                        if (i > 55) {
                            i = 35;
                        }
                        if (j > 96) {
                            j = 64;
                        }
                        if (k == a && l == b) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
