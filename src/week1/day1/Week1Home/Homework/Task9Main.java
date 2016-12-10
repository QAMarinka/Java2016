package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task9Main {
    public static void main(String[] args) {
        //2.9 Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер (число трехкратное)
        // 435  -   1
        //505  -   2
        //555  -   3
        // 305    - 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3digit number");

        int number = sc.nextInt();

        String str = Integer.toString(number);
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char c3 = str.charAt(2);

        int count = 0;

        if (c1 == '5') {
            count++;
        }
        if (c2 == '5') {
            count++;
        }
        if (c3 == '5') {
            count++;
        }
        System.out.println(count);
    }

}
