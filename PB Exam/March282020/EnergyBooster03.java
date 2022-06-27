package PBExam.March282020;

import java.util.Scanner;

public class EnergyBooster03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int setOrder = Integer.parseInt(scanner.nextLine());

        double priceFruit = 0.0;

        switch (set) {
            case "small":
                switch (fruit) {
                    case "Watermelon":
                        priceFruit = 2 * 56 * setOrder;
                        break;
                    case "Mango":
                        priceFruit = 2 * 36.66 * setOrder;
                        break;
                    case "Pineapple":
                        priceFruit = 2 * 42.10 * setOrder;
                        break;
                    case "Raspberry":
                        priceFruit = 2 * 20 * setOrder;
                        break;
                }
                break;
            case "big":
                switch (fruit) {
                    case "Watermelon":
                        priceFruit = 5 * 28.70 * setOrder;
                        break;
                    case "Mango":
                        priceFruit = 5 * 19.60 * setOrder;
                        break;
                    case "Pineapple":
                        priceFruit = 5 * 24.80 * setOrder;
                        break;
                    case "Raspberry":
                        priceFruit = 5 * 15.20 * setOrder;
                        break;
                }
                break;
        }
        if (priceFruit >= 400 && priceFruit <= 1000) {
            priceFruit = priceFruit * 0.85;
        } else if (priceFruit > 1000) {
            priceFruit = priceFruit / 2;
        }
        System.out.printf("%.2f lv.", priceFruit);
    }
}
