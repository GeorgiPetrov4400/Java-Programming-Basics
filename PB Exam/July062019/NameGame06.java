package PBExam.July062019;

import java.util.Scanner;

public class NameGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int maxPoints = Integer.MIN_VALUE;
        String player = "";

        while (!name.equals("Stop")) {
            int points = 0;

            for (int i = 0; i <= name.length() - 1; i++) {
                char symbol = name.charAt(i);
                int number = Integer.parseInt(scanner.nextLine());
                if (symbol == number) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points >= maxPoints) {
                maxPoints = points;
                player = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", player, maxPoints);
    }
}
