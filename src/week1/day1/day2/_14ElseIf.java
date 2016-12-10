package week1.day1.day2;

/**
 * Created by Maryna.Kurganska on 12/10/2016.
 */
public class _14ElseIf {
    public static void main(String[] args) {
        String name = "Marina";
        int age = 26;
        int salary = 5000;

        if (age < 60 & salary > 1000) {
            System.out.println(" Have a nice trip");
        } else if (age > 60 & salary > 1000) {
            System.out.println(" Go to hospital");
        } else if (age < 60 & salary < 1000) {
            System.out.println("Go to work");
        } else {
            System.out.println("Sorry.....");
        }
        System.out.println("Finish...");
    }
}
