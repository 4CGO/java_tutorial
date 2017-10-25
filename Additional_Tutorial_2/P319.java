package Additional_Tutorial_2;

import java.util.Scanner;

public class P319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating-point numbers: ");
        double num1= sc.nextDouble();
        double num2 = sc.nextDouble();

        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are same.");
        }
        else {
            System.out.println("They are different.");
        }
    }
}
