package Loops.practices;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum OF Even Number Is : " + evenSum);
        System.out.println("Sum OF Even Number Is : " + oddSum);
    }
}
