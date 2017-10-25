package Tutorial_2;

import javax.swing.*;

public class Q2_6a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculate 2 Numbers");
        String num1 = JOptionPane.showInputDialog(frame, "Input 1st number");
        String num2 = JOptionPane.showInputDialog(frame, "Input 2nd number");
        int val1 = Integer.parseInt(num1);
        int val2 = Integer.parseInt(num2);

        System.out.println("sum : " + (val1 + val2));
        System.out.println("product : " + (val1 * val2));
        System.out.println("difference : " + (val1 - val2));
        System.out.println("quotient : " + (val1 / val2));
        System.exit(0);
    }
}