package Tutorial_2;

import java.util.Scanner;

public class Q2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input currency : ");
        double cur = sc.nextDouble();
        System.out.println("146.53 LKR = " + (146.53 * cur) + " USD");
    }
}
