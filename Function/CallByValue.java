package Function;

import java.util.Scanner;

public class CallByValue {
    public static void Swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value Of A : " + a);
        System.out.println("Value Of B : " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of B : ");
        int b = sc.nextInt();
        Swap(a, b);
    }
}
