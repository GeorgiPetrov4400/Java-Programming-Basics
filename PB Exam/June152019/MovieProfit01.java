package PBExam.June152019;

import java.util.Scanner;

public class MovieProfit01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double ticketsPerDay = tickets * ticketPrice;
        double revenues = days * ticketsPerDay;
        double percentForCinema = (percent / 100.0) * revenues;
        double profit = revenues - percentForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit);
    }
}
