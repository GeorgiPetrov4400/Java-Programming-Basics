package PBExam.March092019;

import java.util.Scanner;

public class WorldSnookerChampionship03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticket = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double ticketPrice = 0.0;

        switch (stage) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 55.50;
                        break;
                    case "Premium":
                        ticketPrice = 105.20;
                        break;
                    case "VIP":
                        ticketPrice = 118.90;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 75.88;
                        break;
                    case "Premium":
                        ticketPrice = 125.22;
                        break;
                    case "VIP":
                        ticketPrice = 300.40;
                        break;
                }
                break;
            case "Final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 110.10;
                        break;
                    case "Premium":
                        ticketPrice = 160.66;
                        break;
                    case "VIP":
                        ticketPrice = 400;
                        break;
                }
                break;
        }
        double sum = ticketPrice * ticket;
        if (sum > 4000) {
            sum = sum * 0.75;
        } else if (sum > 2500) {
            sum = sum * 0.90;
            if (symbol.equals("Y")) {
                sum = sum + ticket * 40;
            }
        } else {
            if (symbol.equals("Y")) {
                sum = sum + ticket * 40;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
