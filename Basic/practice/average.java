package Basic.practice;

import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A :");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of B :");
        int b = sc.nextInt();
        System.out.print("Enter The Value Of C :");
        int c = sc.nextInt();

        System.out.println("Average Of Three Number Is :" + ((a + b + c) / 2));
    }
}
