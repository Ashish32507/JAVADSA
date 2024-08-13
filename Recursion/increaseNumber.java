package Recursion;

import Pattern.star;

public class increaseNumber {
    public static void printInc(int start, int n) {
        if (start == n) {
            System.out.print(start);
            return;
        }
        System.out.print(start + " ");
        printInc(start + 1, n);
    }

    public static void main(String[] args) {
        printInc(5, 10);
    }
}
