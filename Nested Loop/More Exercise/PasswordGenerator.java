package NestedLoop.MoreExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        char symbol = ' ';
        char symbol2 = ' ';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    for (int m = 1; m <= l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (k == 1) {
                                symbol = 'a';
                            } else if (k == 2) {
                                symbol = 'b';
                            } else if (k == 3) {
                                symbol = 'c';
                            } else if (k == 4) {
                                symbol = 'd';
                            } else if (k == 5) {
                                symbol = 'e';
                            } else if (k == 6) {
                                symbol = 'f';
                            } else if (k == 7) {
                                symbol = 'g';
                            } else if (k == 8) {
                                symbol = 'h';
                            } else if (k == 9) {
                                symbol = 'i';
                            }
                            if (m == 1) {
                                symbol2 = 'a';
                            } else if (m == 2) {
                                symbol2 = 'b';
                            } else if (m == 3) {
                                symbol2 = 'c';
                            } else if (m == 4) {
                                symbol2 = 'd';
                            } else if (m == 5) {
                                symbol2 = 'e';
                            } else if (m == 6) {
                                symbol2 = 'f';
                            } else if (m == 7) {
                                symbol2 = 'g';
                            } else if (m == 8) {
                                symbol2 = 'h';
                            } else if (m == 9) {
                                symbol2 = 'i';
                            }
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, symbol, symbol2, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
