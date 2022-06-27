package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // coins 0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1.00, 2.00

        double returnSum = Double.parseDouble(scanner.nextLine()) * 100;

        int count = 0;

        while (returnSum >= 1) {
            if (returnSum >= 200) {
                count += returnSum / 200;
                returnSum %= 200;
            } else if (returnSum >= 100) {
                count += returnSum / 100;
                returnSum %= 100;
            } else if (returnSum >= 50) {
                count += returnSum / 50;
                returnSum %= 50;
            } else if (returnSum >= 20) {
                count += returnSum / 20;
                returnSum %= 20;
            } else if (returnSum >= 10) {
                count += returnSum / 10;
                returnSum %= 10;
            } else if (returnSum >= 5) {
                count += returnSum / 5;
                returnSum %= 5;
            } else if (returnSum >= 2) {
                count += returnSum / 2;
                returnSum %= 2;
            } else if (returnSum >= 1) {
                count += returnSum / 1;
                returnSum %= 1;
            }
        }
        System.out.println(count);
    }
}
