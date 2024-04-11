package Function.questions;

import java.util.Scanner;

public class SumOfDigit {
    public static int sumDigit(int n) {
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Digit : ");
        int n = sc.nextInt();
        System.out.print("Sum Of Digit Is : " + sumDigit(n));
    }
}
