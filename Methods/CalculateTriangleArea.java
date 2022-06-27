package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    static double getTriangleArea(double length, double height) {
        return (length * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#########");

        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = getTriangleArea(l, h);

        System.out.println(format.format(area));
    }
}
