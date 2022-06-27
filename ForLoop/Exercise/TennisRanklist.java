package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournament = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        double allPoints = 0;
        double count = 0;

        for (int i = 1; i <= tournament; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points = 2000;
                    allPoints += points;
                    count++;
                    break;
                case "F":
                    points = 1200;
                    allPoints += points;
                    break;
                case "SF":
                    points = 720;
                    allPoints += points;
                    break;
            }
        }
        double totalPoints = initialPoints + allPoints;
        double averagePoints = Math.floor(allPoints / tournament);
        double percentWin = count / tournament * 100;

        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", percentWin);
    }
}
