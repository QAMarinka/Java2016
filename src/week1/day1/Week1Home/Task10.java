package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task10 {
    public static void main(String[] args) {
        //10) Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям
        // предоставляется 20% скидка. Ввести продолжительность разговора и день недели (цифра от 1 до 7).//

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter duration of conversation in min");
        int duration = sc.nextInt();

        System.out.println("Enter the number of week day");
        int weekday = sc.nextInt();

        int conversationCost = duration * 2;
        double discount = conversationCost * 0.8;

        if (weekday >=6){
            System.out.println("You have discount and your cost is " + discount);
        } else {
            System.out.println(conversationCost);
        }

    }
}
