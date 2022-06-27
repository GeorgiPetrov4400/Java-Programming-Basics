package PBExam.July062019;

import java.util.Scanner;

public class Club04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());

        String coctailName = scanner.nextLine();

        double sumTotalPrice = 0;

        while (!coctailName.equals("Party!")) {
            int coctailNumber = Integer.parseInt(scanner.nextLine());
            int priceCoctail = coctailName.length();
            double totalPriceCoctail = coctailNumber * priceCoctail;
            if (totalPriceCoctail % 2 != 0) {
                totalPriceCoctail = totalPriceCoctail * 0.75;
            }
            sumTotalPrice += totalPriceCoctail;
            if (sumTotalPrice >= wantedProfit) {
                System.out.println("Target acquired.");
                break;
            }

            coctailName = scanner.nextLine();
        }
        if (wantedProfit > sumTotalPrice) {
            System.out.printf("We need %.2f leva more.%n", wantedProfit - sumTotalPrice);
        }
        System.out.printf("Club income - %.2f leva.", sumTotalPrice);
    }
}
