package Function;

import java.util.Scanner;

public class Product {
    public static void product(int a, int b) {
        System.out.print("Product Of A And B : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of B : ");
        int b = sc.nextInt();
        product(a, b);
    }
}
