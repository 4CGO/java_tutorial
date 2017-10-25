package Additional_Tutorial_1;

import java.util.Scanner;
public class Q10 {
    public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Width : ");
		double width = sc.nextDouble();
		System.out.print("Input Height : ");
		double height = sc.nextDouble();
		
		System.out.println("Area is " + width +" * "+ height+ " = "+(width*height));
		System.out.println("Perimeter is  2 * (" + width +" + "+ height+ ") = "+(2*(width+height)));
    }
}