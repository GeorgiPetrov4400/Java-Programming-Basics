package PBExam.July182020;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class AluminumJoinery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joinery = Integer.parseInt(scanner.nextLine());
        String joineryKind = scanner.nextLine();
        String shipmentMethod = scanner.nextLine();

        double price = 0.0;

        if (joinery > 10) {
            switch (shipmentMethod) {
                case "With delivery":
                    switch (joineryKind) {
                        case "90X130":
                            price = joinery * 110;
                            if (joinery > 30 && joinery <= 60) {
                                price = price - price * 0.05;
                            }
                            if (joinery > 60) {
                                price = price - price * 0.08;
                            }
                            price += 60;
                            break;
                        case "100X150":
                            price = joinery * 140;
                            if (joinery > 40 && joinery <= 80) {
                                price = price - price * 0.06;
                            }
                            if (joinery > 80) {
                                price = price - price * 0.10;
                            }
                            price += 60;
                            break;
                        case "130X180":
                            price = joinery * 190;
                            if (joinery > 20 && joinery <= 50) {
                                price = price - price * 0.07;
                            }
                            if (joinery > 50) {
                                price = price - price * 0.12;
                            }
                            price += 60;
                            break;
                        case "200X300":
                            price = joinery * 250;
                            if (joinery > 25 && joinery <= 50) {
                                price = price - price * 0.09;
                            }
                            if (joinery > 50) {
                                price = price - price * 0.14;
                            }
                            price += 60;
                            break;
                    }
                    break;
                case "Without delivery":
                    switch (joineryKind) {
                        case "90X130":
                            price = joinery * 110;
                            if (joinery > 30 && joinery <= 60) {
                                price = price - price * 0.05;
                            }
                            if (joinery > 60) {
                                price = price - price * 0.08;
                            }
                            break;
                        case "100X150":
                            price = joinery * 140;
                            if (joinery > 40 && joinery <= 80) {
                                price = price - price * 0.06;
                            }
                            if (joinery > 80) {
                                price = price - price * 0.10;
                            }
                            break;
                        case "130X180":
                            price = joinery * 190;
                            if (joinery > 20 && joinery <= 50) {
                                price = price - price * 0.07;
                            }
                            if (joinery > 50) {
                                price = price - price * 0.12;
                            }
                            break;
                        case "200X300":
                            price = joinery * 250;
                            if (joinery > 25 && joinery <= 50) {
                                price = price - price * 0.09;
                            }
                            if (joinery > 50) {
                                price = price - price * 0.14;
                            }
                            break;
                    }
                    break;
            }
            if (joinery > 99) {
                price = price - price * 0.04;
            }
            System.out.printf("%.2f BGN", price);
        } else {
            System.out.println("Invalid order");
        }
    }
}
