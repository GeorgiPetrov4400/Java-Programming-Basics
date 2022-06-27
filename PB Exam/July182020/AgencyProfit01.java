package PBExam.July182020;

import java.util.Scanner;

public class AgencyProfit01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double netPriceAdultTickets = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double netPriceChildTickets = netPriceAdultTickets * 0.30;
        double priceAdultTicketAndTax = netPriceAdultTickets + serviceTax;
        double priceChildTicketAndTax = netPriceChildTickets + serviceTax;
        double priceAllTickets = priceAdultTicketAndTax * adultTickets + priceChildTicketAndTax * childTickets;
        double profitAgency = priceAllTickets * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, profitAgency);

    }
}
