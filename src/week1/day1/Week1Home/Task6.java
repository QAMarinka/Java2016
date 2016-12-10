package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task6 {
    public static void main(String[] args) {
        //6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed");
        float speed = sc.nextFloat();

        System.out.println("Enter distance");
        float distance = sc.nextFloat();

        float time = distance / speed;
        System.out.println(time);


    }
}
