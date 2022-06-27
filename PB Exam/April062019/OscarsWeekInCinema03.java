package PBExam.April062019;

import java.util.Scanner;

public class OscarsWeekInCinema03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hallType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double revenues = 0.0;

        switch (movie) {
            case "A Star Is Born":
                switch (hallType) {
                    case "normal":
                        revenues = tickets * 7.50;
                        break;
                    case "luxury":
                        revenues = tickets * 10.50;
                        break;
                    case "ultra luxury":
                        revenues = tickets * 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (hallType) {
                    case "normal":
                        revenues = tickets * 7.35;
                        break;
                    case "luxury":
                        revenues = tickets * 9.45;
                        break;
                    case "ultra luxury":
                        revenues = tickets * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hallType) {
                    case "normal":
                        revenues = tickets * 8.15;
                        break;
                    case "luxury":
                        revenues = tickets * 10.25;
                        break;
                    case "ultra luxury":
                        revenues = tickets * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (hallType) {
                    case "normal":
                        revenues = tickets * 8.75;
                        break;
                    case "luxury":
                        revenues = tickets * 11.55;
                        break;
                    case "ultra luxury":
                        revenues = tickets * 13.95;
                        break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie, revenues);
    }
}
