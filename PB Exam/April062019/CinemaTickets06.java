package PBExam.April062019;

import java.util.Scanner;

public class CinemaTickets06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int countAllStudent = 0;
        int countAllStandard = 0;
        int countAllKid = 0;

        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int countStudent = 0;
            int countStandard = 0;
            int countKid = 0;
            int usedPlaces = 0;

            String text = scanner.nextLine();
            while (!text.equals("End")) {
                switch (text) {
                    case "student":
                        countStudent++;
                        countAllStudent++;
                        usedPlaces++;
                        break;
                    case "standard":
                        countStandard++;
                        countAllStandard++;
                        usedPlaces++;
                        break;
                    case "kid":
                        countKid++;
                        countAllKid++;
                        usedPlaces++;
                        break;
                }
                if (usedPlaces == freePlaces) {
                    break;
                }
                text = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, usedPlaces * 1.0 / freePlaces * 100);
            movie = scanner.nextLine();
        }
        int allTickets = countAllStudent + countAllStandard + countAllKid;
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", countAllStudent * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countAllStandard * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.", countAllKid * 1.0 / allTickets * 100);
    }
}
