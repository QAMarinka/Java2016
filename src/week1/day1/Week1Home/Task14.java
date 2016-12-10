package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task14 {
    public static void main(String[] args) {
        //14) Определить, является ли шестизначное число "счастливым" (сумма
        // первых трех цифр равна сумме последних трех цифр).

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number (6 digits)");
        int number = sc.nextInt();

        int first = number / 100000;
        int second = number / 10000 % 10;
        int third = number / 1000 % 10;
        int forth = number / 100 % 10;
        int fifth = number / 10 % 10;
        int six = number % 10;

        int firstPart = first + second + third;
        int secondPart = forth + fifth + six;

        if (firstPart == secondPart) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Maybe next time");
        }

    }

}
