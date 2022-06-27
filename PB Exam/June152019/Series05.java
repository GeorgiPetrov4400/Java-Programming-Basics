package PBExam.June152019;

import java.util.Scanner;

public class Series05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int serialNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= serialNumber; i++) {
            String serialName = scanner.nextLine();
            double priceForSerial = Double.parseDouble(scanner.nextLine());
            switch (serialName) {
                case "Thrones":
                    priceForSerial = priceForSerial * 0.50;
                    break;
                case "Lucifer":
                    priceForSerial = priceForSerial * 0.60;
                    break;
                case "Protector":
                    priceForSerial = priceForSerial * 0.70;
                    break;
                case "TotalDrama":
                    priceForSerial = priceForSerial * 0.80;
                    break;
                case "Area":
                    priceForSerial = priceForSerial * 0.90;
                    break;
            }
            budget -= priceForSerial;
        }
        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
