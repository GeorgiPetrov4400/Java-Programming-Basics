package PBExam.October2021;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());

        double kmPerDay = 0.0;
        double totalKm = kmFirstDay + kmPerDay;
        double sumKm = 0.0;

        for (int i = 1; i <= days; i++) {
            int percent = Integer.parseInt(scanner.nextLine());
            kmPerDay = totalKm * (percent * 1.0 / 100);
            totalKm += kmPerDay;
            sumKm += totalKm;

        }
        double allKm = sumKm + kmFirstDay;
        if (allKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allKm - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - allKm));
        }
    }
}
