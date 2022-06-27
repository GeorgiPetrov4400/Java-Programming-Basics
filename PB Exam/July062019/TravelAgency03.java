package PBExam.July062019;

import javax.swing.*;
import java.util.Scanner;

public class TravelAgency03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String equipment = scanner.nextLine();
        String discount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if (days > 0) {

            double price = 0.0;
            switch (town) {
                case "Bansko":
                    switch (equipment) {
                        case "withEquipment":
                            price = 100;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.90;
                                    break;
                            }
                            break;
                        case "noEquipment":
                            price = 80;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.95;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                            return;
                    }
                    break;
                case "Borovets":
                    switch (equipment) {
                        case "withEquipment":
                            price = 100;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.90;
                                    break;
                            }
                            break;
                        case "noEquipment":
                            price = 80;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.95;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                            return;
                    }
                    break;
                case "Varna":
                    switch (equipment) {
                        case "withBreakfast":
                            price = 130;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.88;
                                    break;
                            }
                            break;
                        case "noBreakfast":
                            price = 100;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.93;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                            return;
                    }
                    break;
                case "Burgas":
                    switch (equipment) {
                        case "withBreakfast":
                            price = 130;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.88;
                                    break;
                            }
                            break;
                        case "noBreakfast":
                            price = 100;
                            switch (discount) {
                                case "yes":
                                    price = price * 0.93;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                            return;
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    return;
            }
            if (days > 7) {
                double totalPrice = price * (days - 1);
                System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
            } else {
                double totalPrice = price * days;
                System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
            }
        } else {
            System.out.println("Days must be positive number!");
        }
    }
}
