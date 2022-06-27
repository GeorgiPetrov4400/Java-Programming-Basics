package PBExam.July182020;

import java.util.Scanner;

public class BarcodeGenerator06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int firstFirst = number / 1000;
        int firstSecond = (number / 100) % 10;
        int firstThird = (number / 10) % 10;
        int firstFourth = number % 10;

        int secondFirst = number2 / 1000;
        int secondSecond = (number2 / 100) % 10;
        int secondThird = (number2 / 10) % 10;
        int secondFourth = number2 % 10;

        for (int i = firstFirst; i <= secondFirst; i++) {
            for (int j = firstSecond; j <= secondSecond; j++) {
                for (int k = firstThird; k <= secondThird; k++) {
                    for (int l = firstFourth; l <= secondFourth; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
