package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Enumeration;
import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (double i = 0; i >= 0; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n", number * 2);
            }
        }

    }
}

