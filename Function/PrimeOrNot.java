package Function;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean primeNumber(int n) {
        boolean flag = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        // if (flag) {
        // return true;
        // } else {
        // return false;
        // }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        if (primeNumber(n)) {
            System.out.print("Given Number Is Prime");
        } else {
            System.out.print("Given Number Is Not Prime");
        }
    }
}
