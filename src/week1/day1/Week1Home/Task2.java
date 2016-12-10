package week1.day1.Week1Home;


import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task2 {
    public static void main(String[] args) {

        // 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0//

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first digit");
        double a = sc.nextDouble();

        System.out.println("Enter second digit");
        double b = sc.nextDouble();

        System.out.println("Enter third digit");
        double c = sc.nextDouble();

        //a = CheckAndReplace(a);
        //b = CheckAndReplace(b);
        //c = CheckAndReplace(c);

        if (a > 0) {
            a = Math.pow(a, 3);
        } else {
            a = 0;
        }
        if (b > 0) {
            b = Math.pow(b, 3);
        } else {
            b = 0;
        }
        if (c > 0) {
            c = Math.pow(c, 3);
        } else {
            c = 0;
        }
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }

    public static double CheckAndReplace(double number) {
        if (number > 0) {
            number = Math.pow(number, 3);
        } else {
            number = 0;
        }

        return number;
    }
}
