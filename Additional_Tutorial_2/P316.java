package Additional_Tutorial_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        Collections.sort(list);

        for (String str : list) {
            System.out.println(str);
        }
    }
}
