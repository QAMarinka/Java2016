package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task5Main {
    public static void main(String[] args) {
        //2.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
        // Если второе больше, то выводим сумму.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        if (first > second){
            System.out.println(first - second);
        } else if (second > first){
            System.out.println( first + second);
        }
    }
}
