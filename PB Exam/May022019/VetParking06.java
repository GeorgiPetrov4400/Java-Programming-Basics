package PBExam.May022019;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class VetParking06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double totalTax = 0.0;
        int countDay = 0;

        for (int dayPrice = 1; dayPrice <= days; dayPrice++) {
            double hourTax = 0.0;
            double dayTax = 0.0;
            countDay++;

            for (int hourPrice = 1; hourPrice <= hoursPerDay; hourPrice++) {

                if (dayPrice % 2 == 0 && hourPrice % 2 != 0) {
                    hourTax = 2.50;
                    dayTax += hourTax;
                } else if (dayPrice % 2 != 0 && hourPrice % 2 == 0) {
                    hourTax = 1.25;
                    dayTax += hourTax;
                } else {
                    hourTax = 1;
                    dayTax += hourTax;
                }
            }
            totalTax += dayTax;
            System.out.printf("Day: %d - %.2f leva%n", countDay, dayTax);
        }
        System.out.printf("Total: %.2f leva", totalTax);
    }
}
