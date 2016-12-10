package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task3Main {
    public static void main(String[] args) {
        // 2.3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        double number = sc.nextDouble();

        double duplicateNumber = number * 2;
        if (number % 7 == 0) {
            System.out.println("This number is / 7 so it will be duplicated = " + duplicateNumber);
        }
    }
}
