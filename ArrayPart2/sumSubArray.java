
package ArrayPart2;

import java.util.Scanner;

public class sumSubArray {
    public static void printSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k < j; k++) {
                    // System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }
                System.out.println("Current Sum " + currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum Of All Is : " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 10, 20, 30, 40, 50, 60 };
        printSubArray(array);
    }
}