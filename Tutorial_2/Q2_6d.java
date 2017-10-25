package Tutorial_2;

import javax.swing.*;

public class Q2_6d
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculate 2 Numbers");
        String name1 = JOptionPane.showInputDialog(frame, "Input 1st name");
        String name2 = JOptionPane.showInputDialog(frame, "Input 2nd name");
        JOptionPane.showMessageDialog(frame,name1 + " " + name2);
        System.exit(0);
    }
}