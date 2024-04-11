package Function;

import java.util.Scanner;

public class Bionomial {
    public static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N : ");
        int n = sc.nextInt();
        System.out.print("Enter The Value Of R : ");
        int r = sc.nextInt();
        System.out.print("Binomial Cofficent Is : " + (facto(n) / (facto(r) * facto(n - r))));

    }
}
