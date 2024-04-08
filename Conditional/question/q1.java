package Conditional.question;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("Number Is Positive");
        } else {
            System.out.println("Number Is Negative");
        }

        String value = a >= 0 ? "Positive Number " : "Negative Number ";
        System.out.println(value);
    }
}
