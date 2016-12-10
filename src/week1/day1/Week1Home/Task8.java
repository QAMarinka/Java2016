package week1.day1.Week1Home;

import java.util.Scanner;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class Task8 {
    public static void main(String[] args) {
        // 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предоставляется,
        // если сумма покупки превышает 1000 гривен.//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of purchase");
        double purchase = sc.nextDouble();

        double discount = purchase * 0.9;
        if (purchase > 1000){
            System.out.println("You have discount 10 % and the sum to pay is " + discount);
        } else {
            System.out.println("You have no discount");
        }
    }
}
