package Conditional.question;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Temprature :");
        float temp = sc.nextFloat();

        String result = temp >= 100 ? "You Have Fever" : "You Have Not Fever";
        System.out.println(result);
    }
}
