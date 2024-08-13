package Recursion;

public class fibonacciNum {
    public static int fab(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int fib1 = fab(n - 1);
        int fib2 = fab(n - 2);
        int fn = fib1 + fib2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fab(5));
    }
}
