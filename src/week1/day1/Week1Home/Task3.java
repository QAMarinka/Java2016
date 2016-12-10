package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task3 {
    public static void main(String[] args) {

        // 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры одинаковые;
        // б) есть ли среди его цифр одинаковые.//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3digit number");
        int number = sc.nextInt();

        String str = Integer.toString(number);
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char c3 = str.charAt(2);

        if (c1 == c2 && c2 == c3) {
            System.out.println("All digits are equal");
        } else if (c1 == c2 || c1 == c3 || c2 == c3) {
            System.out.println("There are some equal digits");
        } else {
            System.out.println("No equal digits");
        }

    }
}
