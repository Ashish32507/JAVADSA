package Function;

import java.util.*;

public class BinaryToDecimal {
    public static void decimNumber(int n) {
        int decimal = 0;
        int rem;
        int pow = 0;
        while (n != 0) {
            rem = n % 10;
            decimal = decimal + rem * (int) Math.pow(2, pow);
            n = n / 10;
            pow++;
        }

        System.out.print("Decimal Value Is : " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Binary Number : ");
        int n = sc.nextInt();
        decimNumber(n);
    }
}
