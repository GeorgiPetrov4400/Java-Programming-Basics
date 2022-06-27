package PBExam.October2021;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardTransport = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        //Нощувка - 20 лв.
        //Карта за транспорт - 1.60 лв.
        //Билет за музей - 6 лв.
        double sumNights = nights * 20;
        double sumCardTransport = cardTransport * 1.60;
        double sumTickets = tickets * 6;
        double pricePerPerson = sumNights + sumTickets + sumCardTransport;
        double sumForAll = pricePerPerson * people;
        double totalSum = sumForAll + sumForAll * 0.25;

        System.out.printf("%.2f", totalSum);

    }
}
