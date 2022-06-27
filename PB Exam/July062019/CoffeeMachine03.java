package PBExam.July062019;

import java.util.Scanner;

public class CoffeeMachine03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksNumber = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        price = drinksNumber * 0.90;
                        price = price - price * 0.35;
                        break;
                    case "Normal":
                        price = drinksNumber * 1.00;
                        break;
                    case "Extra":
                        price = drinksNumber * 1.20;
                        break;
                }
                if (drinksNumber >= 5) {
                    price = price - price * 0.25;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        price = drinksNumber * 1.00;
                        price = price - price * 0.35;
                        break;
                    case "Normal":
                        price = drinksNumber * 1.20;
                        break;
                    case "Extra":
                        price = drinksNumber * 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        price = drinksNumber * 0.50;
                        price = price - price * 0.35;
                        break;
                    case "Normal":
                        price = drinksNumber * 0.60;
                        break;
                    case "Extra":
                        price = drinksNumber * 0.70;
                        break;
                }
                break;
        }
        if (price > 15) {
            price = price - price * 0.20;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksNumber, drink, price);
    }
}
