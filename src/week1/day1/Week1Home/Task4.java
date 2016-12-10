package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task4 {
    public static void main(String[] args) {
        //4) Известны две скорости, одна в километрах в час, другая в метрах в секунду. Какая из них больше?//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed in km/h");
        double speed1 = sc.nextInt();

        System.out.println("Enter speed in m/s");
        double speed2 = sc.nextInt();

        speed2 = speed2 * 3.6;

        if(speed1 > speed2){
            System.out.println("Speed in km is bigger");
        }else {
            System.out.println("Speed in m is bigger");
        }



    }
}
