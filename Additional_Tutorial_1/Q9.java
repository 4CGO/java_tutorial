package Additional_Tutorial_1;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Perimeter is = " + 2* Math.PI*radius);
		System.out.println("Area is =  = " + Math.PI*(radius*radius));
		
    }
}