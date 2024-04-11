package Function;

import java.util.Scanner;

public class DecimalToBinary {
    public static void DecBinary(int n) {
        int rem;
        int bin = 0;
        int pow = 0;
        while (n != 0) {
            rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        System.out.print("Binary Value Is : " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Decimal Value :");
        int n = sc.nextInt();
        DecBinary(n);
    }
}
