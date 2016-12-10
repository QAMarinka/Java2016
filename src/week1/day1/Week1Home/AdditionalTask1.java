package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */

// 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить,
// является ли он прямоугольным. Ответ вывести в виде сообщения.//

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();

        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c, 2);

        if(aPow == bPow + cPow){
            System.out.println("Rectangle");
        } else if(bPow == aPow + cPow) {
            System.out.println("Rectangle");
        } else if(cPow == aPow + bPow) {
            System.out.println("Rectangle");
        } else {
            System.out.println("Not Rectangle");
        }
    }
}




