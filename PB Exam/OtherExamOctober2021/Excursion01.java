package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class Excursion01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardForTransport = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double sumNights = nights * 20;
        double sumTransport = cardForTransport * 1.60;
        double sumTickets = tickets * 6;
        double sumPerPerson = sumNights + sumTransport + sumTickets;
        double totalSum = sumPerPerson * people;
        double discountSum = totalSum + totalSum * 0.25;

        System.out.printf("%.2f", discountSum);

    }
}
