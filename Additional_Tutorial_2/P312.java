package Additional_Tutorial_2;

import java.util.Scanner;

public class P312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input letGrade : ");
        String letGrade = sc.next();

        double addVal = 0;
        if (letGrade.charAt(1) == '+') {
            addVal += 0.3;
        }
        else if (letGrade.charAt(1) == '-') {
            addVal -= 0.3;
        }

        double numGrade = 0;
        if (letGrade.charAt(0) == 'A') {
            if (addVal < 0) {
                numGrade += 4 + addVal;
            }
            else if (addVal > 0) {
                numGrade += 4;
            }
        }
        else if (letGrade.charAt(0) == 'B') {
            numGrade += 3 + addVal;
        }
        else if (letGrade.charAt(0) == 'C') {
            numGrade += 2 + addVal;
        }
        else if (letGrade.charAt(0) == 'D') {
            numGrade += 1 + addVal;
        }
        else if (letGrade.charAt(0) == 'F') {
            if (addVal > 0) {
                numGrade += 0 + addVal;
            }
            else if (addVal < 0) {
                numGrade += 0;
            }
        }

        System.out.printf("Numeric value : "+ numGrade);
    }
}
