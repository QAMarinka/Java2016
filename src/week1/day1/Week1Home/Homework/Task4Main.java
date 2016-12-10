package week1.day1.Week1Home.Homework;


import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task4Main {
    public static void main(String[] args) {
        //2.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float number");

        float number = sc.nextFloat();

        if (number > 0 && number < 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
