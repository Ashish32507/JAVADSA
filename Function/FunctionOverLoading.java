package Function;

import java.util.Scanner;

public class FunctionOverLoading {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MulitPlication Of Int Value :" + multiply(7, 8));
        System.out.println("MulitPlication Of Float Value :" + multiply(7.5, 6.2));
        System.out.println("MulitPlication Of Double Value :" + multiply(2, 6));
        System.out.println("Sum Of Two Value :" + (sum(5, 5)));
        System.out.println("Sum Of Two Value :" + (sum(5, 5, 5)));
    }
}
