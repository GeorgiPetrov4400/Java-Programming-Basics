package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int time = first + second + third;
        int timeMinutes = time / 60;
        int timeSeconds = time % 60;
        if (timeSeconds < 10) {
            System.out.printf("%d:0%d", timeMinutes, timeSeconds);
        } else {
            System.out.printf("%d:%d", timeMinutes, timeSeconds);
        }

    }
}
