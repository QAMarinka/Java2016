package week1.day1.day2;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class _13ConditionalStatements {
    public static void main(String[] args) {
        String name = "Marina";
        int pass = 123456;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password ");
        int enteredPass = sc.nextInt();

        if (pass == enteredPass) {

            System.out.println("Enter successful, welcome " + name);
        } else {
            System.out.println("Wrong password, try again");
        }
    }
}
