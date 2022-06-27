package Methods;

import java.util.Scanner;

public class DrawAFilledSquare {
    static void printHeaderFooter(int n) {
        System.out.println(new String(new char[2 * n]).replace("\0", "-"));
    }

    static void printMiddleRow(int n) {
        System.out.print("-");
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\\/");
        }
        System.out.println("-");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 0) {
            printHeaderFooter(n);
            printMiddleRow(n);
            printMiddleRow(n);
            printHeaderFooter(n);
        } else {
            printHeaderFooter(n);
            printMiddleRow(n);
            printMiddleRow(n);
            printMiddleRow(n);
            printHeaderFooter(n);
        }
    }
}
