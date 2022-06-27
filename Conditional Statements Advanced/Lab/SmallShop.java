import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {
            if (town.equals("Sofia")) {
                System.out.println(amount * 0.50);
            } else if (town.equals("Plovdiv")) {
                System.out.println(amount * 0.40);
            } else if (town.equals("Varna")) {
                System.out.println(amount * 0.45);
            }
        }
        if (product.equals("water")) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", amount * 0.80);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", amount * 0.70);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", amount * 0.70);
            }
        }
        if (product.equals("beer")) {
            if (town.equals("Sofia")) {
                System.out.printf("%.2f", amount * 1.20);
            } else if (town.equals("Plovdiv")) {
                System.out.printf("%.2f", amount * 1.15);
            } else if (town.equals("Varna")) {
                System.out.printf("%.2f", amount * 1.10);
            }
        }
        if (product.equals("sweets")) {
            if (town.equals("Sofia")) {
                System.out.println(amount * 1.45);
            } else if (town.equals("Plovdiv")) {
                System.out.println(amount * 1.30);
            } else if (town.equals("Varna")) {
                System.out.println(amount * 1.35);
            }
        }
        if (product.equals("peanuts")) {
            if (town.equals("Sofia")) {
                System.out.println(amount * 1.60);
            } else if (town.equals("Plovdiv")) {
                System.out.println(amount * 1.50);
            } else if (town.equals("Varna")) {
                System.out.println(amount * 1.55);
            }
        }
    }
}
