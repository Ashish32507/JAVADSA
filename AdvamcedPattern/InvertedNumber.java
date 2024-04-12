package AdvamcedPattern;

import java.util.Scanner;

public class InvertedNumber {
    public static void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value : ");
        int n = sc.nextInt();
        printNumber(n);
    }
}
