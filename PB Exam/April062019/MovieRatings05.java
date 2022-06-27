package PBExam.April062019;

import java.util.Scanner;

public class MovieRatings05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());

        double totalRating = 0.0;
        double minRating = Double.MAX_VALUE;
        String minName = "";
        double maxRating = Double.MIN_VALUE;
        String maxName = "";

        for (int i = 1; i <= movies; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating += rating;
            if (rating < minRating) {
                minRating = rating;
                minName = movieName;
            }
            if (rating > maxRating) {
                maxRating = rating;
                maxName = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", maxName, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minName, minRating);
        System.out.printf("Average rating: %.1f", totalRating / movies);
    }
}
