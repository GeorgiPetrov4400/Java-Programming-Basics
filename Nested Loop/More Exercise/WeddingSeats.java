package NestedLoop.MoreExercise;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int oddPlaces = Integer.parseInt(scanner.nextLine());

        char symbol = lastSector.charAt(0);
        int count = 0;
        int countI = 0;

        for (char i = 'A'; i <= symbol; i++) {
            countI++;
            if (countI > 1) {
                rows += 1;
            }
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 0) {
                    for (int k = 1; k <= (oddPlaces + 2); k++) {
                        char seatEven = ' ';
                        if (k == 1) {
                            seatEven = (char) 97;
                        } else if (k == 2) {
                            seatEven = (char) 98;
                        } else if (k == 3) {
                            seatEven = (char) 99;
                        } else if (k == 4) {
                            seatEven = (char) 100;
                        } else if (k == 5) {
                            seatEven = (char) 101;
                        } else if (k == 6) {
                            seatEven = (char) 102;
                        } else if (k == 7) {
                            seatEven = (char) 103;
                        } else if (k == 8) {
                            seatEven = (char) 104;
                        } else if (k == 9) {
                            seatEven = (char) 105;
                        } else if (k == 10) {
                            seatEven = (char) 106;
                        } else if (k == 11) {
                            seatEven = (char) 107;
                        } else if (k == 12) {
                            seatEven = (char) 108;
                        } else if (k == 13) {
                            seatEven = (char) 109;
                        } else if (k == 14) {
                            seatEven = (char) 110;
                        } else if (k == 15) {
                            seatEven = (char) 111;
                        } else if (k == 16) {
                            seatEven = (char) 112;
                        } else if (k == 17) {
                            seatEven = (char) 113;
                        } else if (k == 18) {
                            seatEven = (char) 114;
                        } else if (k == 19) {
                            seatEven = (char) 115;
                        } else if (k == 20) {
                            seatEven = (char) 116;
                        } else if (k == 21) {
                            seatEven = (char) 117;
                        } else if (k == 22) {
                            seatEven = (char) 118;
                        } else if (k == 23) {
                            seatEven = (char) 119;
                        } else if (k == 24) {
                            seatEven = (char) 120;
                        }
                        System.out.printf("%c%d%c%n", i, j, seatEven);
                        count++;
                    }
                } else {
                    for (int k = 1; k <= oddPlaces; k++) {
                        char seatOdd = ' ';
                        if (k == 1) {
                            seatOdd = (char) 97;
                        } else if (k == 2) {
                            seatOdd = (char) 98;
                        } else if (k == 3) {
                            seatOdd = (char) 99;
                        } else if (k == 4) {
                            seatOdd = (char) 100;
                        } else if (k == 5) {
                            seatOdd = (char) 101;
                        } else if (k == 6) {
                            seatOdd = (char) 102;
                        } else if (k == 7) {
                            seatOdd = (char) 103;
                        } else if (k == 8) {
                            seatOdd = (char) 104;
                        } else if (k == 9) {
                            seatOdd = (char) 105;
                        } else if (k == 10) {
                            seatOdd = (char) 106;
                        } else if (k == 11) {
                            seatOdd = (char) 107;
                        } else if (k == 12) {
                            seatOdd = (char) 108;
                        } else if (k == 13) {
                            seatOdd = (char) 109;
                        } else if (k == 14) {
                            seatOdd = (char) 110;
                        } else if (k == 15) {
                            seatOdd = (char) 111;
                        } else if (k == 16) {
                            seatOdd = (char) 112;
                        } else if (k == 17) {
                            seatOdd = (char) 113;
                        } else if (k == 18) {
                            seatOdd = (char) 114;
                        } else if (k == 19) {
                            seatOdd = (char) 115;
                        } else if (k == 20) {
                            seatOdd = (char) 116;
                        } else if (k == 21) {
                            seatOdd = (char) 117;
                        } else if (k == 22) {
                            seatOdd = (char) 118;
                        } else if (k == 23) {
                            seatOdd = (char) 119;
                        } else if (k == 24) {
                            seatOdd = (char) 120;
                        }
                        System.out.printf("%c%d%c%n", i, j, seatOdd);
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
