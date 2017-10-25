package Tutorial_2;

import javax.swing.*;

public class Q2_6b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sphere");
        String rad = JOptionPane.showInputDialog(frame, "Input radius of a Sphere");
        double radVal = Double.parseDouble(rad);

        System.out.println("Surface Area of a Sphere : " + (4 * Math.PI * (radVal * radVal)));
        System.out.println("Volume of a Sphere : " + (4 / 3 * Math.PI * (radVal * radVal * radVal)));
        System.exit(0);
    }
}