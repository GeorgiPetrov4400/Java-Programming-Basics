package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double firstPipe = P1 * H;
        double secondPipe = P2 * H;
        double volume = firstPipe + secondPipe;
        double volumePercent = (volume / V) * 100;
        double firstPipePercent = (firstPipe / volume) * 100;
        double secondPipePersent = (secondPipe / volume) * 100;

        if (volume <= V) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", volumePercent, firstPipePercent, secondPipePersent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %s liters.", H, (volume - V));
        }

    }
}
