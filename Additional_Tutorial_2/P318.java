package Additional_Tutorial_2;

import java.util.Scanner;

public class P318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a month: ");
        int month = sc.nextInt();
        System.out.print("Input a day: ");
        int day = sc.nextInt();

        String season = "";

        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";
        } else if (month == 10 || month == 11 || month == 12) {
            season = "Fall";
        }

        if (month % 3 == 0 && day >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else if (season.equals("Spring")) {
                season = "Summer";
            } else if (season.equals("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }

        System.out.printf("Season: " + season);

    }
}
