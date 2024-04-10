package Pattern;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Pattern :");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
