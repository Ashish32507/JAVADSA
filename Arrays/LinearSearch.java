package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The " + (i + 1) + " Element of Array : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter The Key : ");
        int key = sc.nextInt();

        int index = LinearSearch(array, key);

        if (index > -1) {
            System.out.print("Element Is Found At :" + index);
        } else {
            System.out.print("Element Is Not Found");
        }

    }
}
