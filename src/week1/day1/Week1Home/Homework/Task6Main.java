package week1.day1.Week1Home.Homework;

import java.util.Scanner;


/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task6Main {
    public static void main(String[] args) {
        //2.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        int sum = first + second;

        if (sum >= 11 && sum <= 19) {
            System.out.println("Sum is " + sum);
        }
    }
}
