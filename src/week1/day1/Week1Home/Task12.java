package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task12 {
    public static void main(String[] args) {
        //Написать программу, которая в зависимости от характера ветра выдает
        // сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
        // умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4)//

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed of wind");
        double speed = sc.nextDouble();

        if (speed <=4) {
            System.out.println("Week");
        }else if (speed <=10){
            System.out.println("Moderate");
        }else if (speed <=18){
            System.out.println("Strong");
        } else if(speed >= 19){
            System.out.println("Hurricane");
        }

    }
}
