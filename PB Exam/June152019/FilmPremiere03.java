package PBExam.June152019;

import java.util.Scanner;

public class FilmPremiere03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String food = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (movie) {
            case "John Wick":
                switch (food) {
                    case "Drink":
                        totalSum = tickets * 12;
                        break;
                    case "Popcorn":
                        totalSum = tickets * 15;
                        break;
                    case "Menu":
                        totalSum = tickets * 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (food) {
                    case "Drink":
                        totalSum = tickets * 18;
                        if (tickets >= 4) {
                            totalSum = totalSum * 0.70;
                        }
                        break;
                    case "Popcorn":
                        totalSum = tickets * 25;
                        if (tickets >= 4) {
                            totalSum = totalSum * 0.70;
                        }
                        break;
                    case "Menu":
                        totalSum = tickets * 30;
                        if (tickets >= 4) {
                            totalSum = totalSum * 0.70;
                        }
                        break;
                }
                break;
            case "Jumanji":
                switch (food) {
                    case "Drink":
                        totalSum = tickets * 9;
                        if (tickets == 2) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Popcorn":
                        totalSum = tickets * 11;
                        if (tickets == 2) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Menu":
                        totalSum = tickets * 14;
                        if (tickets == 2) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.", totalSum);
    }
}
