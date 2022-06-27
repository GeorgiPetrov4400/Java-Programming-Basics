package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liter = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();

        //Бензин – 2.22 лева за един литър,
        //Дизел – 2.33 лева за един литър
        //Газ – 0.93 лева за литър

        double gasolinePrice = liter * 2.22;
        double gasolinePriceDiscount = liter * 2.04;
        double dieselPrice = liter * 2.33;
        double dieselPriceDiscount = liter * 2.21;
        double gasPrice = liter * 0.93;
        double gasPriceDiscount = liter * 0.85;

        if (fuel.equals("Gas")) {
            if (discountCard.equals("Yes")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", gasPriceDiscount - gasPriceDiscount * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", gasPriceDiscount - gasPriceDiscount * 0.10);
                } else if (liter < 25) {
                    System.out.printf("%.2f lv.", gasPriceDiscount);
                }
            } else if (discountCard.equals("No")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", gasPrice - gasPrice * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", gasPrice - gasPrice * 0.10);
                }
            } else if (liter < 25) {
                System.out.printf("%.2f lv.", gasPrice);
            }
        } else if (fuel.equals("Gasoline")) {
            if (discountCard.equals("Yes")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", gasolinePriceDiscount - gasolinePriceDiscount * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", gasolinePriceDiscount - gasolinePriceDiscount * 0.10);
                } else if (liter < 25) {
                    System.out.printf("%.2f lv.", gasolinePriceDiscount);
                }
            } else if (discountCard.equals("No")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", gasolinePrice - gasolinePrice * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", gasolinePrice - gasolinePrice * 0.10);
                } else if (liter < 25) {
                    System.out.printf("%.2f lv.", gasolinePrice);
                }
            }
        } else if (fuel.equals("Diesel")) {
            if (discountCard.equals("Yes")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", dieselPriceDiscount - dieselPriceDiscount * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", dieselPriceDiscount - dieselPriceDiscount * 0.10);
                } else if (liter < 25) {
                    System.out.printf("%.2f lv.", dieselPriceDiscount);
                }
            } else if (discountCard.equals("No")) {
                if (liter >= 20 && liter <= 25) {
                    System.out.printf("%.2f lv.", dieselPrice - dieselPrice * 0.08);
                } else if (liter > 25) {
                    System.out.printf("%.2f lv.", dieselPrice - dieselPrice * 0.10);
                } else if (liter < 25) {
                    System.out.printf("%.2f lv.", dieselPrice);
                }
            }
        }
    }
}
