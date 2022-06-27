package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double sumCatFood = 0.0;

        for (int i = 1; i <= cats; i++) {
            double catFood = Double.parseDouble(scanner.nextLine());
            if (catFood >= 100 && catFood < 200) {
                smallCats++;
                sumCatFood += catFood;
            }
            if (catFood >= 200 && catFood < 300) {
                bigCats++;
                sumCatFood += catFood;
            }
            if (catFood >= 300 && catFood < 400) {
                hugeCats++;
                sumCatFood += catFood;
            }
        }
        double priceCatFood = sumCatFood / 1000 * 12.45;
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", hugeCats);
        System.out.printf("Price for food per day: %.2f lv.", priceCatFood);
    }
}
