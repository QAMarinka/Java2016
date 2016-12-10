package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task11 {
    public static void main(String[] args) {
        //11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
        // добавляет к нему слово "копейка" в правильной форме. Например, 1
        // копейка, 5 копеек, 42 копейки .

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 99");
        int number = sc.nextInt();

        if (number % 10 == 1 && number != 11) {
            System.out.println("Kopeika");
        } else if (number % 10 >= 2 && number % 10 <= 4 && number != 12 && number != 13
                && number != 14) {
            System.out.println("Kopeiki");
        } else {
            System.out.println("Kopeek");
        }


    }
}
