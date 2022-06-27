package NestedLoop.MoreExercise;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coinNumber1Lv = Integer.parseInt(scanner.nextLine());
        int coinNumber2Lv = Integer.parseInt(scanner.nextLine());
        int banknoteNumber5Lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= coinNumber1Lv; i++) {
            for (int j = 0; j <= coinNumber2Lv; j++) {
                for (int k = 0; k <= banknoteNumber5Lv; k++) {
                    if ((i * 1 + j * 2 + k * 5 == sum)) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
