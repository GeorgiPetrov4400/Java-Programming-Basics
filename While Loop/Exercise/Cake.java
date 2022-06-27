package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidht = Integer.parseInt(scanner.nextLine());
        int cakeLenght = Integer.parseInt(scanner.nextLine());

        int cake = cakeWidht * cakeLenght;
        int sumPieces = 0;

        while (cake >= sumPieces) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                sumPieces = cake - sumPieces;
                break;
            }
            int pieces = Integer.parseInt(input);
            sumPieces += pieces;
        }
        if (sumPieces <= cake) {
            System.out.printf("%d pieces are left.", sumPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", sumPieces - cake);
        }
    }
}
