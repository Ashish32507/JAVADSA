package Basic;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius Of Circle :");
        int r = sc.nextInt();
        System.out.println("Area Of Circle :" + (2 * 3.14 * r * r));
    }
}
