package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class ExcursionCalculator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double sumExcursion = 0.0;

        if (people <= 5) {
            switch (season) {
                case "spring":
                    sumExcursion = people * 50;
                    break;
                case "summer":
                    sumExcursion = (people * 48.50) * 0.85;
                    break;
                case "autumn":
                    sumExcursion = people * 60;
                    break;
                case "winter":
                    sumExcursion = people * 86 + people * 86 * 0.08;
                    break;
            }
        } else {
            switch (season) {
                case "spring":
                    sumExcursion = people * 48;
                    break;
                case "summer":
                    sumExcursion = (people * 45) * 0.85;
                    break;
                case "autumn":
                    sumExcursion = people * 49.50;
                    break;
                case "winter":
                    sumExcursion = people * 85 + people * 85 * 0.08;
                    break;
            }
        }
        System.out.printf("%.2f leva.", sumExcursion);
    }
}
