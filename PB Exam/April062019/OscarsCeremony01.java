package PBExam.April062019;

import java.util.Scanner;

public class OscarsCeremony01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double statuette = hallRent - hallRent * 0.30;
        double catering = statuette - statuette * 0.15;
        double sound = catering / 2;

        double totalCosts = hallRent + statuette + catering + sound;
        System.out.printf("%.2f", totalCosts);
    }
}
