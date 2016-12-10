package week1.day1.Week1Home.Homework;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task2Main {
    public static void main(String[] args) {
        //2.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
                int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

       // int min = Math.min(Math.min(a,b),c);//

          if (a > b && a > c) {
              System.out.println("A is max and =" + a);
          } else if (b > a && b > c) {
              System.out.println("B is max and =" + b);
          } else if (c > a && c > b) {
              System.out.println("C is max and =" + c);
          }
          if (a < b && a < c) {
              System.out.println("A is min and =" + a);
          } else if (b < a && b < c) {
              System.out.println("B is min and =" + b);
          } else if (c < a && c < b) {
              System.out.println("C is min and =" + c);
       }
    }
}
