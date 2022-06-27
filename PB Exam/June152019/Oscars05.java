package PBExam.June152019;

import java.util.Scanner;

public class Oscars05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());

        double totalPoint = 0.0;

        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            double pointsForActor = juryName.length() * juryPoints / 2;
            totalPoint += pointsForActor;
            if (initialPoints + totalPoint > 1250.50) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                        nameActor, initialPoints + totalPoint);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.50 - (initialPoints + totalPoint));
    }
}
