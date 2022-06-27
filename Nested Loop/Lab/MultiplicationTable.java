package NestedLoop.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                int result = first * second;
                System.out.printf("%d * %d = %d%n", first, second, result);
            }
        }
    }
}
