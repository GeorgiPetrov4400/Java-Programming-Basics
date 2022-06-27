package PBExam.April062019;

import java.util.Scanner;

public class CinemaVoucher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();

        int tickets = 0;
        int others = 0;

        while (!text.equals("End")) {
            int price = 0;
            if (text.length() > 8) {
                price = text.charAt(0);
                price += text.charAt(1);
                if (voucher - price < 0) {
                    break;
                } else {
                    tickets++;
                    voucher -= price;
                }
            } else {
                price = text.charAt(0);
                if (voucher - price < 0) {
                    break;
                } else {
                    others++;
                    voucher -= price;
                }
            }

            text = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(others);
    }
}
