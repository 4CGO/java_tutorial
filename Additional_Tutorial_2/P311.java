package Additional_Tutorial_2;

import java.util.Scanner;

public class P311 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature : ");
        double temp = sc.nextDouble();

        System.out.print("Input sign (F/C) : ");
        char tempSign = sc.next().toUpperCase().charAt(0);

        System.out.println("Input altitude value: ");
        int altitude = sc.nextInt();

        System.out.println("Input altitude (M/F) : ");
        char altitudeSign = sc.next().toUpperCase().charAt(0);

        int degDropCelsius = 0;
        if (altitudeSign == 'F') {
            degDropCelsius = altitude / 1000;
        } else if (altitudeSign == 'M') {
            degDropCelsius = altitude / 300;
        }

        if (tempSign == 'C') {
            if (temp <= 0 - degDropCelsius) {
                System.out.println("Solid");
            } else if (temp >= 100 - degDropCelsius) {
                System.out.println("BOIL");
            } else {
                System.out.println("LIQUID");
            }
        } else if (tempSign == 'F') {
            temp = temp / 33.8;
            if (temp <= 0 - degDropCelsius) {
                System.out.println("SOLID");
            } else if (temp >= 100 - degDropCelsius) {
                System.out.println("BOIL");
            } else {
                System.out.println("LIQUID");
            }
        } else {
            System.out.println("Error : Invalid input");
        }
    }
}