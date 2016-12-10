package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task8Main {
    public static void main(String[] args) {
        //2.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        // 124    4    -   true
        // 1456   567  -   false
        // 1      2    -   false
        // 18     98   -   true

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");

        int a = sc.nextInt();

        System.out.println("Enter second number");

        int b = sc.nextInt();

        int lastA = a % 10;
        int lastB = b % 10;

        if (lastA == lastB) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
