package Recursion;

public class sumofN {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fn = n + sum(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        System.out.print(sum(10));
    }
}
