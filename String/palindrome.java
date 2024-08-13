import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String :");
        String str = sc.nextLine();
        isPalindrome(str);
    }

    public static void isPalindrome(String str) {
        boolean palindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.print("Given String Is Palindrome");
        } else {
            System.out.print("Given String Is Not Palindrome");
        }
    }
}