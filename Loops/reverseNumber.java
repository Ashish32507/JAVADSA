package Loops;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 10899;
        int rem = 0;

        // while (n != 0) {
        // rem = n % 10;
        // System.out.print(rem);
        // n = n / 10;
        // }

        // New Reverse Number

        int rev = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println("Reverse Of Number :" + rev);
    }
}
