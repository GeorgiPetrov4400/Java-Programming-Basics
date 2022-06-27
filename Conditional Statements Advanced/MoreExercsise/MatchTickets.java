package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0.0;
        double ticket = 0.0;

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
            if (category.equals("VIP")) {
                ticket = people * 499.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }

            } else if (category.equals("Normal")) {
                ticket = people * 249.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }
            }
        } else if (people >= 5 && people <= 9) {
            transport = budget * 0.60;
            if (category.equals("VIP")) {
                ticket = people * 499.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }

            } else if (category.equals("Normal")) {
                ticket = people * 249.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }
            }
        } else if (people >= 10 && people <= 24) {
            transport = budget * 0.50;
            if (category.equals("VIP")) {
                ticket = people * 499.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }

            } else if (category.equals("Normal")) {
                ticket = people * 249.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }
            }
        } else if (people >= 25 && people <= 49) {
            transport = budget * 0.40;
            if (category.equals("VIP")) {
                ticket = people * 499.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }

            } else if (category.equals("Normal")) {
                ticket = people * 249.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }
            }
        } else if (people >= 50) {
            transport = budget * 0.25;
            if (category.equals("VIP")) {
                ticket = people * 499.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }

            } else if (category.equals("Normal")) {
                ticket = people * 249.99;
                if (budget >= (ticket + transport)) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs((budget - transport) - ticket));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.",
                            Math.abs((budget - transport) - ticket));
                }
            }
        }
    }
}
