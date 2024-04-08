package Conditional;

import java.util.Scanner;

public class incomeTex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Amount :");
        int am = sc.nextInt();
        if (am < 500000) {
            System.out.print("Your Gst Amount Is :" + 0);
        } else if (am >= 500000 && am < 1000000) {
            System.out.print("Your Gst Amount Is : " + (am * 0.2));
        } else if (am >= 1000000) {
            System.out.print("Your Gst Amount Is : " + (am * 0.3));
        }
    }
}
