package Function;

import java.util.Scanner;

public class Factorial {
    public static int fatc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of N : ");
        int n = sc.nextInt();
        System.out.print("Factorial Of Number Is : " + fatc(n));
    }
}
