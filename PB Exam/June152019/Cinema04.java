package PBExam.June152019;

import java.util.Scanner;

public class Cinema04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int allClients = 0;
        double totalSum = 0.0;

        while (!input.equals("Movie time!")) {
            int clients = Integer.parseInt(input);
            double sum = clients * 5;
            if (clients % 3 == 0) {
                sum = sum - 5;
            }

            allClients += clients;
            if (allClients > hallCapacity) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %.0f lv.", totalSum);
                return;
            }
            totalSum += sum;

            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.%n", hallCapacity - allClients);
        System.out.printf("Cinema income - %.0f lv.", totalSum);
    }
}
