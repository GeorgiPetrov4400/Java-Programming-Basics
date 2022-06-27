package PBExam.March092019;

import java.util.Scanner;

public class Gymnastics03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();

        double value = 0.0;

        switch (country) {
            case "Bulgaria":
                switch (instrument) {
                    case "ribbon":
                        value = 19;
                        break;
                    case "hoop":
                        value = 19.3;
                        break;
                    case "rope":
                        value = 18.9;
                        break;
                }
                break;
            case "Italy":
                switch (instrument) {
                    case "ribbon":
                        value = 18.7;
                        break;
                    case "hoop":
                        value = 18.8;
                        break;
                    case "rope":
                        value = 18.85;
                        break;
                }
                break;
            case "Russia":
                switch (instrument) {
                    case "ribbon":
                        value = 18.5;
                        break;
                    case "hoop":
                        value = 19.1;
                        break;
                    case "rope":
                        value = 18.6;
                        break;
                }
                break;
        }
        double difference = 20 - value;
        System.out.printf("The team of %s get %.3f on %s.%n", country, value, instrument);
        System.out.printf("%.2f%%", (difference / 20) * 100);
    }
}
