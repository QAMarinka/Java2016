package week1.day1.Week1Home;


import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task5 {
    public static void main(String[] args) {
        //5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных//


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        System.out.println("Enter number c");
        int c = sc.nextInt();

        if (a == b && a == c && c == b) {
            System.out.println("All numbers are equal");
        } else if (a == b || a == c || c == b) {
            System.out.println("One pair is equal");
        } else {
            System.out.println("No equal pair");
        }
    }
}
