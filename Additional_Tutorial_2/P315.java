package Additional_Tutorial_2;

import java.util.Scanner;

public class P315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double lrg = Math.max(num1, num2);
        lrg = Math.max(lrg, num3);

        System.out.println("The largest number is " + lrg);
    }
}
