package ForLoop.MoreExercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());

        double sumElectricity = 0.0;
        int water = 20;
        double sumWater = 0;
        int internet = 15;
        double sumInternet = 0;
        double sumOthers = 0.0;

        for (int i = 1; i <= month; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            sumElectricity += electricity;
            sumWater += water;
            sumInternet += internet;
            sumOthers += (electricity + water + internet) + (electricity + water + internet) * 0.20;
        }
        System.out.printf("Electricity: %.2f lv%n", sumElectricity);
        System.out.printf("Water: %.2f lv%n", sumWater);
        System.out.printf("Internet: %.2f lv%n", sumInternet);
        System.out.printf("Other: %.2f lv%n", sumOthers);
        System.out.printf("Average: %.2f lv%n", (sumElectricity + sumWater + sumInternet + sumOthers) / month);
    }
}
