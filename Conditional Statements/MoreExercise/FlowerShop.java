package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        //Магнолии – 3.25 лева
        //Зюмбюли – 4 лева
        //Рози – 3.50 лева
        //Кактуси – 8 лева

        double sum = magnolias * 3.25 + hyacinth * 4 + roses * 3.50 + cacti * 8;
        double tax = sum * 0.05;
        double profit = sum - tax;

        if (profit >= priceGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - priceGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift - profit));
        }


    }
}
