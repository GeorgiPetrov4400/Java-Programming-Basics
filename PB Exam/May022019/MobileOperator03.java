package PBExam.May022019;

import java.util.Scanner;

public class MobileOperator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String duration = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int paymentMonths = Integer.parseInt(scanner.nextLine());

        double montlyTax = 0.0;

        switch (duration) {
            case "one":
                switch (typeOfContract) {
                    case "Small":
                        montlyTax = 9.98;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 5.50;
                        }
                        break;
                    case "Middle":
                        montlyTax = 18.99;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 4.35;
                        }
                        break;
                    case "Large":
                        montlyTax = 25.98;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 4.35;
                        }
                        break;
                    case "ExtraLarge":
                        montlyTax = 35.99;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 3.85;
                        }
                        break;
                }
                break;
            case "two":
                switch (typeOfContract) {
                    case "Small":
                        montlyTax = 8.58;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 5.50;
                        }
                        break;
                    case "Middle":
                        montlyTax = 17.09;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 4.35;
                        }
                        break;
                    case "Large":
                        montlyTax = 23.59;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 4.35;
                        }
                        break;
                    case "ExtraLarge":
                        montlyTax = 31.79;
                        if (mobileInternet.equals("yes")) {
                            montlyTax += 3.85;
                        }
                        break;
                }
                break;
        }
        double totalSum = montlyTax * paymentMonths;
        if (duration.equals("two")) {
            totalSum = totalSum - totalSum * 0.0375;
        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
