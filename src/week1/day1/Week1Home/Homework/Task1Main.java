package week1.day1.Week1Home.Homework;



import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task1Main {
    public static void main(String[] args) {
        //2.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
        // Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")//

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current hour (0-24)");
            int hour = sc.nextInt();

        if (hour >= 9 && hour <=18) {
            System.out.println("I am at work");
        } else{
            System.out.println("I have a rest");
        }
        }
    }