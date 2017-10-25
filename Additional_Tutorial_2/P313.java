package Additional_Tutorial_2;

import java.util.Scanner;

public class P313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numeric value (0-4): ");
        double mark = sc.nextDouble();

        String grade = "0";
        if (mark < 0 || mark > 4) {
            System.out.println("Invalid mark");
        } else if (mark >= 3.85) {
            grade = "A";
        } else if (mark >= 3.7) {
            grade = "A-";
        } else if (mark >= 3.0) {
            grade = "B+";
        } else if (mark >= 2.85) {
            grade = "B";
        } else if (mark >= 2.7) {
            grade = "B-";
        } else if (mark >= 2.0) {
            grade = "C+";
        } else if (mark >= 1.85) {
            grade = "C";
        } else if (mark >= 1.7) {
            grade = "C-";
        } else if (mark >= 1.0) {
            grade = "D+";
        } else if (mark > 0.85) {
            grade = "D";
        } else if (mark > 0.7) {
            grade = "D-";
        } else {
            grade = "F";
        }

        System.out.printf("Grade : " + grade);
    }

}
