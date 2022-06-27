package PBExam.March282020;

import java.util.Scanner;

public class TrekkingMania04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int allPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5) {
                musala += people;
                allPeople += people;
            } else if (people <= 12) {
                montblanc += people;
                allPeople += people;
            } else if (people <= 25) {
                kilimanjaro += people;
                allPeople += people;
            } else if (people <= 40) {
                k2 += people;
                allPeople += people;
            } else {
                everest += people;
                allPeople += people;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", montblanc * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%", everest * 1.0 / allPeople * 100);
    }
}
