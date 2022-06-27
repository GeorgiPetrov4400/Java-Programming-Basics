package PBExam.March092019;

import java.util.Scanner;

public class Darts04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        String text = scanner.nextLine();
        int initialPoint = 301;
        int count = 0;
        int countUnsuccesfull = 0;

        while (!text.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            switch (text) {
                case "Single":
                    if (points > initialPoint) {
                        points = 0;
                        countUnsuccesfull++;
                        count--;
                    }
                    initialPoint -= points;
                    count++;
                    break;
                case "Double":
                    if (points * 2 > initialPoint) {
                        points = 0;
                        countUnsuccesfull++;
                        count--;
                    }
                    initialPoint -= points * 2;
                    count++;
                    break;
                case "Triple":
                    if (points * 3 > initialPoint) {
                        points = 0;
                        countUnsuccesfull++;
                        count--;
                    }
                    initialPoint -= points * 3;
                    count++;
                    break;
            }
            if (initialPoint == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, count);
                return;
            }

            text = scanner.nextLine();
        }
        System.out.printf("%s retired after %d unsuccessful shots.", playerName, countUnsuccesfull);

    }
}
