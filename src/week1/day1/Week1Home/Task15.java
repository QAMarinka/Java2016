package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task15 {
    public static void main(String[] args) {
        // 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
        // квадрат; б) уместится ли квадрат в круге.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area of circle");
        double circleArea = sc.nextDouble();

        System.out.println("Enter area of square");
        double rectangleArea = sc.nextDouble();

        double circleRadius = Math.sqrt(circleArea/Math.PI);
        double rectangleSide = Math.sqrt(rectangleArea);

        if (circleRadius <= rectangleSide/2){
            System.out.println("Circle is in rectangle");
            //a
        }
        if(Math.sqrt(2*Math.pow(rectangleSide,2))<= circleRadius*2){
            System.out.println("Rectangle is in circle");
            //b

        }

    }
}
