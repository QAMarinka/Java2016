package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task9 {
    public static void main(String[] args) {
        //Написать программу вычисления идеального веса пользователя (рост-110).
        // Выдать рекомендации о необходимости поправиться либо похудеть.//

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in sm");
        double height = sc.nextDouble();

        System.out.println("Enter your weight");
        double weight = sc.nextDouble();

        if (height - weight == 110) {
            System.out.println("You have ideal weight");
        } else if (height - weight > 110) {
            System.out.println("You can go to MacDonalds right now");
        } else if (height - weight < 110) {
            System.out.println("You need to loose weight");
        }

    }
}
