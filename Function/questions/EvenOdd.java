package Function.questions;

import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N :");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.print("Entered Number Is Even");
        } else {
            System.out.print("Entered Number Is Odd");
        }
    }
}
