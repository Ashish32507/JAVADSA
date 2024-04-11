package Function.questions;

import java.util.Scanner;

public class ThreeAverage {
    public static void Average(int a, int b, int c) {
        System.out.print("Average Of Three Number Is : " + ((a + b + c) / 3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A :");
        int a = sc.nextInt();
        System.out.print("Enter The value Of B :");
        int b = sc.nextInt();
        System.out.print("Enter The Value Of C : ");
        int c = sc.nextInt();
        Average(a, b, c);
    }
}
