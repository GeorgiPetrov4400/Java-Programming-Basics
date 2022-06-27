package NestedLoop.MoreExercise;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlM = Integer.parseInt(scanner.nextLine());

        int countPassword = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        boolean isFourth = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && (a * b + c * d) == controlM) {
                            countPassword++;
                            if (countPassword == 4) {
                                first = a;
                                second = b;
                                third = c;
                                fourth = d;
                                isFourth = true;
                            }
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                    }
                }
            }
        }
        if (isFourth) {
            System.out.println();
            System.out.printf("Password: %d%d%d%d", first, second, third, fourth);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
