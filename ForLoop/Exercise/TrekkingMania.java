package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int allPeople = 0;

        for (int i = 1; i <= group; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5) {
                musala += people;
                allPeople += people;
            } else if (people >= 6 && people <= 12) {
                montBlanc += people;
                allPeople += people;
            } else if (people >= 13 && people <= 25) {
                kilimanjaro += people;
                allPeople += people;
            } else if (people >= 26 && people <= 40) {
                k2 += people;
                allPeople += people;
            } else {
                everest += people;
                allPeople += people;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", montBlanc * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / allPeople * 100);
    }

}
