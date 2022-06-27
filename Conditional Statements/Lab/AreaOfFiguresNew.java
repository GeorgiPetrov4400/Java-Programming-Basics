import java.util.Scanner;

public class AreaOfFiguresNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        //double num = Double.parseDouble(scanner.nextLine());
        //double num2 = Double.parseDouble(scanner.nextLine());
        //double squareArea = num * num;
        //double rectangleArea = num * num2;
        //double circleArea = Math.PI * num * num;
        //double triangleArea = num * num2 / 2;

        if (figure.equals("square")) {
            double num = Double.parseDouble(scanner.nextLine());
            double squareArea = num * num;
            System.out.printf("%.3f", squareArea);
        } else if (figure.equals("rectangle")) {
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double rectangleArea = num * num2;
            System.out.printf("%.3f", rectangleArea);
        } else if (figure.equals("circle")) {
            double num = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * num * num;
            System.out.printf("%.3f", circleArea);
        } else if (figure.equals("triangle")) {
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double triangleArea = num * num2 / 2;
            System.out.printf("%.3f", triangleArea);
        }
    }
}


