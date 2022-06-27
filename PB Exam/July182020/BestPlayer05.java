package PBExam.July182020;

import java.util.Scanner;

public class BestPlayer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();

        int maxGoal = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoal) {
                maxGoal = goals;
                bestPlayer = player;
            }
            if (goals >= 10) {
                break;
            }

            player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoal >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoal);
        } else {
            System.out.printf("He has scored %d goals.", maxGoal);
        }
    }
}
