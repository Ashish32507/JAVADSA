package Arrays;

import java.util.Scanner;

public class largestArray {
    public static int LargestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array :");
        int n = sc.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The " + (i + 1) + " Element of Array : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Largest Value Is : " + LargestNumber(array));

    }
}
