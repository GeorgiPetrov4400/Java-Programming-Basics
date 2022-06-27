import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")) {
            if (sells > 10000) {
                System.out.printf("%.2f", sells * 0.12);
            } else if (sells <= 10000 && sells > 1000) {
                System.out.printf("%.2f", sells * 0.08);
            } else if (sells <= 1000 && sells > 500) {
                System.out.printf("%.2f", sells * 0.07);
            } else if (sells <= 500 && sells > 0) {
                System.out.printf("%.2f", sells * 0.05);
            } else if (sells < 0) {
                System.out.println("error");
            }
        } else if (town.equals("Varna")) {
            if (sells > 10000) {
                System.out.printf("%.2f", sells * 0.13);
            } else if (sells <= 10000 && sells > 1000) {
                System.out.printf("%.2f", sells * 0.10);
            } else if (sells <= 1000 && sells > 500) {
                System.out.printf("%.2f", sells * 0.075);
            } else if (sells <= 500 && sells > 0) {
                System.out.printf("%.2f", sells * 0.045);
            } else if (sells < 0) {
                System.out.println("error");
            }
        } else if (town.equals("Plovdiv")) {
            if (sells > 10000) {
                System.out.printf("%.2f", sells * 0.145);
            } else if (sells <= 10000 && sells > 1000) {
                System.out.printf("%.2f", sells * 0.12);
            } else if (sells <= 1000 && sells > 500) {
                System.out.printf("%.2f", sells * 0.08);
            } else if (sells <= 500 && sells > 0) {
                System.out.printf("%.2f", sells * 0.055);
            } else if (sells < 0) {
                System.out.println("error");
            }
        } else if (!town.equals("Sofia") || !town.equals("Varna") || !town.equals("Plovdiv")) {
            System.out.println("error");
        }
    }
}
