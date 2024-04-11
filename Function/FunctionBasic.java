package Function;

import java.util.Scanner;

public class FunctionBasic {
    public static void outPut() {
        System.out.println("Hello World");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        outPut();
        outPut();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of B : ");
        int b = sc.nextInt();

        System.out.print("Sum Of A and B : " + sum(a, b));
    }
}
