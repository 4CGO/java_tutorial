package Additional_Tutorial_2;

import java.util.Scanner;

public class P320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your birthday (month and day): ");
        int month = sc.nextInt();
        int day = sc.nextInt();

        /* I use this link for Birth dates for all sun signs :
         http://www.metta.org.uk/star/zodiac.asp */

        String sign = "";
        if (!(month < 1 || month > 12 && day < 1 || day > 31)) {
            if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
                sign = "Aries";
            }
            else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
                sign = "Taurus";
            }
            else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
                sign = "Gemini";
            }
            else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
                sign = "Cancer";
            }
            else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                sign = "Leo";
            }
            else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                sign = "Virgo";
            }
            else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                sign = "Libra";
            }
            else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                sign = "Scorpio";
            }
            else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                sign = "Sagittarius";
            }
            else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
                sign = "Capricorn";
            }
            else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
                sign = "Aquarius";
            }
            else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
                sign = "Pisces";
            }
        }else {
            System.out.println("Input incorrect month/day!");
        }
        System.out.println(sign);
    }
}
