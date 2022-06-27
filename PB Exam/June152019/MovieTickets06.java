package PBExam.June152019;

import java.util.Scanner;

public class MovieTickets06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = a1; i <= a2 - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= n / 2 - 1; k++) {
                    if (i % 2 != 0 && (i + j + k) % 2 != 0) {
                        char symbol = (char) i;
                        System.out.printf("%c-%d%d%d%n",symbol, j, k, i);
                    }
                }
            }
        }
    }
}
