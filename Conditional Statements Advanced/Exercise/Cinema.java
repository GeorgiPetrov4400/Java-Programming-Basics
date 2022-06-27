package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double places = r * c;
        if (projection.equals("Premiere")) {
            System.out.printf("%.2f leva", places * 12.00);
        } else if (projection.equals("Normal")) {
            System.out.printf("%.2f leva", places * 7.50);
        } else if (projection.equals("Discount")) {
            System.out.printf("%.2f leva", places * 5.00);
        }
    }
}
