package Loops.practices;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Table :");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + "*" + i + "=" + (j * i));
            }
        }
    }
}
