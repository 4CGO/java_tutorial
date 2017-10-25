package Additional_Tutorial_2;

import java.util.Scanner;

public class P39 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature : ");
        double temp = sc.nextDouble();
        System.out.print("Input sign (F/C) : ");
        char sign = sc.next().toUpperCase().charAt(0);

        if (sign== 'F') {
            if (temp <= 34) {
                System.out.println("Solid");
            }
            else if (temp >= 34 && temp <= 134) {
                System.out.println("Liquid");
            }
            else if (temp > 134) {
                System.out.println("Gaseous");
            }
        } else if (sign == 'C') {
            if (temp <= 0) {
                System.out.println("Solid");
            }
            else if (temp >= 0 && temp <= 100) {
                System.out.println("Liquid");
            }
            else if (temp > 100) {
                System.out.println("Gaseous");
            }
        } else {
            System.out.println("Error");
        }
    }
}