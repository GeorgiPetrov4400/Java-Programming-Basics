package PBExam.April202019;

import java.util.Scanner;

public class EasterParty02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double envelope = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double sum = guests * envelope;
        double priceCake = budget * 0.10;
        if (guests >= 10 && guests <= 15) {
            sum *= 0.85;
        } else if (guests > 15 && guests <= 20) {
            sum *= 0.8;
        } else if (guests > 20) {
            sum *= 0.75;
        }
        if (sum + priceCake <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - (sum + priceCake));
        } else {
            System.out.printf("No party! %.2f leva needed.", (sum + priceCake) - budget);
        }
    }
}
