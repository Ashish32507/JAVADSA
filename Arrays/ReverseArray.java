package Arrays;

import java.util.*;

public class ReverseArray {

    public static void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
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

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        reverse(array);
    }
}
