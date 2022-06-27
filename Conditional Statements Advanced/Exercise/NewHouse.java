package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flower = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.nextLine());

        //Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double priceRoses = flower * 5;
        double priceDahlias = flower * 3.80;
        double priceTulips = flower * 2.80;
        double priceNarcissus = flower * 3;
        double priceGladiolus = flower * 2.50;

        if (flowerType.equals("Roses")) {
            if (flower > 80) {
                priceRoses = priceRoses - priceRoses * 0.10;
            }
            if (priceRoses > budjet) {
                System.out.printf("Not enough money, you need %.2f leva more.", priceRoses - budjet);
            } else {
                System.out.printf("Hey, you have a great garden with %d %s and " +
                        "%.2f leva left.", flower, flowerType, budjet - priceRoses);
            }
        } else if (flowerType.equals("Dahlias")) {
            if (flower > 90) {
                priceDahlias = priceDahlias - priceDahlias * 0.15;
            }
            if (priceDahlias > budjet) {
                System.out.printf("Not enough money, you need %.2f leva more.", priceDahlias - budjet);
            } else {
                System.out.printf("Hey, you have a great garden with %d %s and " +
                        "%.2f leva left.", flower, flowerType, budjet - priceDahlias);
            }
        } else if (flowerType.equals("Tulips")) {
            if (flower > 80) {
                priceTulips = priceTulips - priceTulips * 0.15;
            }
            if (priceTulips > budjet) {
                System.out.printf("Not enough money, you need %.2f leva more.", priceTulips - budjet);
            } else {
                System.out.printf("Hey, you have a great garden with %d %s and " +
                        "%.2f leva left.", flower, flowerType, budjet - priceTulips);
            }
        } else if (flowerType.equals("Narcissus")) {
            if (flower < 120) {
                priceNarcissus = priceNarcissus + priceNarcissus * 0.15;
            }
            if (priceNarcissus > budjet) {
                System.out.printf("Not enough money, you need %.2f leva more.", priceNarcissus - budjet);
            } else {
                System.out.printf("Hey, you have a great garden with %d %s and " +
                        "%.2f leva left.", flower, flowerType, budjet - priceNarcissus);
            }
        } else if (flowerType.equals("Gladiolus")) {
            if (flower < 80) {
                priceGladiolus = priceGladiolus + priceGladiolus * 0.20;
            }
            if (priceGladiolus > budjet) {
                System.out.printf("Not enough money, you need %.2f leva more.", priceGladiolus - budjet);
            } else {
                System.out.printf("Hey, you have a great garden with %d %s and " +
                        "%.2f leva left.", flower, flowerType, budjet - priceGladiolus);
            }
        }
    }
}
