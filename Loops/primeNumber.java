package Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }

        if (flag) {
            System.out.print("Entered Number Is Prime Number");
        } else {
            System.out.print("Entered Number Is Prime Not Number");
        }
    }
}
