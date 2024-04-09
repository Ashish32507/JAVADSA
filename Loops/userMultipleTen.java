package Loops;

import java.util.Scanner;

public class userMultipleTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while (true) {
        // System.out.print("Enter The Number :");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // System.out.print("Enterd Number Is Divisible By 10");
        // break;
        // }
        // }

        // do {
        // System.out.print("Enter The Number :");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // System.out.print("Enterd Number Is Divisible By 10");
        // break;
        // }
        // } while (true);

        // Countinue

        do {
            System.out.print("Enter The Number :");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            } else {
                System.out.println(n);
            }
        } while (true);

    }
}
