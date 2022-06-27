package PBExam.March282020;

import java.util.Scanner;

public class SuitcasesLoad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int countSuitcases = 0;
        double sumLuggage = 0.0;

        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input);
            sumLuggage += suitcaseVolume;
            if (sumLuggage >= trunkCapacity) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
                return;
            }
            countSuitcases++;
            input = scanner.nextLine();
        }
        System.out.println("Congratulations! All suitcases are loaded!");
        System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
    }
}
