package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumInput = 0;

        while (sumInput <= 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                sumInput += Integer.parseInt(scanner.nextLine());
                break;
            }
            sumInput += Integer.parseInt(input);
        }
        if (sumInput >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumInput - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumInput);
        }
    }
}
