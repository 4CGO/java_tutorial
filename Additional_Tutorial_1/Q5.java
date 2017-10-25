package Additional_Tutorial_1;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));
    }
}