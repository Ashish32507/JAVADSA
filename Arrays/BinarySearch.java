package Arrays;

import java.util.*;

public class BinarySearch {
    public static int SearchElement(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
        System.out.print("Enter The Key : ");
        int key = sc.nextInt();

        int index = SearchElement(array, key);
        if (index > -1) {
            System.out.print("Element Is Found At :" + index);
        } else {
            System.out.print("Element Is Found At :" + index);
        }
    }
}
