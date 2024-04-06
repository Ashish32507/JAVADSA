package Basic;

import java.util.Scanner;

public class Sum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A :");
        int a = sc.nextInt();
        System.out.print("Enter The Value Of B :");
        int b = sc.nextInt();
        System.out.println("Sum Of A and B :" + (a + b));
    }
}
