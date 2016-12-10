package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task13 {
    public static void main(String[] args) {
        //13) Даны три числа A,B,C. Увеличить числа в два
        // раза, если A+B+C>0, в противном случае заменить на нули.//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter c");
        int c = sc.nextInt();


        if (a + b + c > 0) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = b = c = 0;
        }

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}
