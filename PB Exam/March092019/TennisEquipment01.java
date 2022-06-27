package PBExam.March092019;

import java.util.Scanner;

public class TennisEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRacketNumber = Integer.parseInt(scanner.nextLine());
        int snickersNumber = Integer.parseInt(scanner.nextLine());

        double priceRackets = tennisRacketPrice * tennisRacketNumber;
        double priceSnickersPair = tennisRacketPrice / 6;
        double priceAllSnickers = snickersNumber * priceSnickersPair;
        double priceOtherEquipment = (priceRackets + priceAllSnickers) * 0.20;
        double totalPrice = priceRackets + priceAllSnickers + priceOtherEquipment;

        double priceDjokovic = totalPrice / 8;
        double priceSponsors = totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(priceDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(priceSponsors));
    }

}

