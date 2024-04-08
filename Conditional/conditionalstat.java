package Conditional;

import java.util.Scanner;

public class conditionalstat {
    public static void main(String[] args) {
        // int age = 18;
        // if (age >= 18) {
        // System.out.println("You Are Ault");
        // } else {
        // System.out.println("You are not Adult");
        // }

        // if (age > 13 && age < 18) {
        // System.out.println("You Are Teenager");
        // }

        Scanner sc = new Scanner(System.in);

        // Greater

        // System.out.println("Enter The 1st Number :");
        // int a = sc.nextInt();
        // System.out.println("Enter The 2nd Number :");
        // int b = sc.nextInt();
        // if (a >= b) {
        // System.out.println("Value Of A : " + a);
        // } else {
        // System.out.println("Value Of B : " + b);
        // }

        // Check Even And Odd

        // System.out.println("Enter The 1st Number :");
        // int a = sc.nextInt();

        // if (a % 2 == 0) {
        // System.out.println("Entered Number Is Even");
        // } else {
        // System.out.println("Entered Number Is Not Even");
        // }

        // Larger Of Three Number

        // System.out.print("Enter The First Number :");
        // int a = sc.nextInt();
        // System.out.print("Enter The Second Number :");
        // int b = sc.nextInt();
        // System.out.print("Enter The Third Number :");
        // int c = sc.nextInt();

        // if (a >= b && a >= c) {
        // System.out.print("A is Greater");
        // } else if (b >= a && b >= c) {
        // System.out.print("B is Greater");
        // } else {
        // System.out.print("C is Greater");
        // }

        // Ternary Operator

        // System.out.print("Enter The First Number :");
        // int a = sc.nextInt();
        // System.out.print("Enter The Second Number :");
        // int b = sc.nextInt();

        // String type = a % 2 == 0 ? "Even" : "Odd";

        // System.out.print(type);

        System.out.print("Enter The Marks :");
        int a = sc.nextInt();

        String result = a > 33 ? "Pass" : "Fail";
        System.out.print(result);
    }
}
