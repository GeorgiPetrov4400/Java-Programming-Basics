package PBExam.March092019;

import java.util.Scanner;

public class FitnessCenter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int countTraining = 0;
        int countBuyer = 0;
        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countProteinShake = 0;
        int countProteinBar = 0;

        for (int i = 1; i <= visitors; i++) {
            String text = scanner.nextLine();
            switch (text) {
                case "Back":
                    countBack++;
                    countTraining++;
                    break;
                case "Chest":
                    countChest++;
                    countTraining++;
                    break;
                case "Legs":
                    countLegs++;
                    countTraining++;
                    break;
                case "Abs":
                    countAbs++;
                    countTraining++;
                    break;
                case "Protein shake":
                    countProteinShake++;
                    countBuyer++;
                    break;
                case "Protein bar":
                    countProteinBar++;
                    countBuyer++;
                    break;
            }
        }
        System.out.printf("%d - back%n", countBack);
        System.out.printf("%d - chest%n", countChest);
        System.out.printf("%d - legs%n", countLegs);
        System.out.printf("%d - abs%n", countAbs);
        System.out.printf("%d - protein shake%n", countProteinShake);
        System.out.printf("%d - protein bar%n", countProteinBar);
        System.out.printf("%.2f%% - work out%n", countTraining * 1.0 / visitors * 100);
        System.out.printf("%.2f%% - protein", countBuyer * 1.0 / visitors * 100);
    }
}
