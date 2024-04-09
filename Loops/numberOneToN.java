package Loops;

import java.util.Scanner;

public class numberOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N :");
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println("Value Of Count : " + count);
            count++;
        }
    }
}
