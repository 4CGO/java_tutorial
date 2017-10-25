package Tutorial_2;

import javax.swing.*;

public class Q2_6c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square and Cube of the given number");
        String num = JOptionPane.showInputDialog(frame, "Input integer");
        int val = Integer.parseInt(num);

        System.out.println("Square of " + val + " is : " + (val * val));
        System.out.println("Cube of " + val + " is : " + (val * val * val));
        System.exit(0);
    }
}