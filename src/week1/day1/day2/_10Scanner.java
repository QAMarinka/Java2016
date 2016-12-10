package week1.day1.day2;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/9/2016.
 */
public class _10Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

           String name =   sc.nextLine();

        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        System.out.println(age);
    }
}
