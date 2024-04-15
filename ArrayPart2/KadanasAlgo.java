package ArrayPart2;

import java.util.Scanner;

public class KadanasAlgo {
    public static void printSum(int arr[]) {
        int Currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Currentsum = Currentsum + arr[i];
            if (Currentsum < 0) {
                maxSum = 0;
                Currentsum = 0;
            }
            maxSum = Math.max(Currentsum, maxSum);

        }

        System.out.print("Maximum Some Is : " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printSum(arr);
    }
}
