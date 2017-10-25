package Additional_Tutorial_2;

import java.util.Scanner;

public class P317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fTime = sc.nextLine();
        int fTHours = Integer.parseInt(fTime.substring(0, 2));
        int fTMinutes = Integer.parseInt(fTime.substring(2));

        String sTime = sc.nextLine();
        int sTHours = Integer.parseInt(sTime.substring(0, 2));
        int sTMinutes = Integer.parseInt(sTime.substring(2));

        if (fTHours < sTHours) {
            System.out.println(fTime);
            System.out.println(sTime);
        } else if (fTHours == sTHours) {
            if (fTMinutes < sTMinutes) {
                System.out.println(fTime);
                System.out.println(sTime);
            } else if (fTMinutes == fTMinutes) {
                System.out.println(fTime);
                System.out.println(sTime);
            } else {
                System.out.println(sTime);
                System.out.println(fTime);
            }
        } else {
            System.out.println(sTime);
            System.out.println(fTime);
        }
    }
}
