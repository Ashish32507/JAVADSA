package Function.questions;

import java.util.Scanner;

public class PalindromeCheck {
    public static int isPalindrome(int n) {
        int rem;
        int pow = 0;
        int number = 0;
        while (n > 0) {
            rem = n % 10;
            number = number * 10 + rem;
            pow++;
            n = n / 10;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        if (n == isPalindrome(n)) {
            System.out.println("Given Number Is Palindrome Give Value Is " + n + " Reverese Value" + isPalindrome(n));
        } else {
            System.out.println("Enterde Value Is Not Palindrome");
        }
    }
}
