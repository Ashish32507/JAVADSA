package Loops;

import java.util.Scanner;

public class firstNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N :");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count <= n) {
            sum += count;
            count++;
        }
        System.out.println("Sum Of N Number Is : " + sum);
    }
}
