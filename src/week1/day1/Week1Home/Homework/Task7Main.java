package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task7Main {
    public static void main(String[] args) {
        //водим два числа, если одно из них делиться на другое без остатка,
        // то выводим true и показываем результат деления (целую часть от деления  и остачу)
        // в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        float first = sc.nextFloat();

        System.out.println("Enter second number");
        float second = sc.nextFloat();

        float res = first / second;
        float res2 = first % second;

        if (res2 == 0) {
            System.out.println("True " + Math.floor(res) + " Rest is " + res2);
        } else {
            System.out.println("False " + Math.floor(res) + " Rest is " + res2);
        }
    }
}
