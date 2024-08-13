package BasicSorting;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Element :");
        int n = sc.nextInt();

        int arr[] = new int[5];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}