package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class SumAndProduct06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == a * b * c * d && n % 5 == 0) {
                            System.out.println(a * 1000 + b * 100 + c * 10 + d);
                            return;
                        } else if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            System.out.println(d * 1000 + c * 100 + b * 10 + a);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Nothing found");
    }
}
