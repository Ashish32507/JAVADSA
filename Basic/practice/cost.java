package Basic.practice;

import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Price Of Pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter The price Of pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter The Value Of Eraser :");
        float eraser = sc.nextFloat();
        System.out.println("Price Of Pen :" + pen);
        System.out.println("Price Of Pencil :" + pencil);
        System.out.println("Price Of Eraser :" + eraser);
        System.out.println("Toatal Price Is :" + (pen + pencil + eraser));
        System.out.println("Your Bill Is After The Gst :" + ((pen + pencil + eraser) + (pen + pencil + eraser) * 0.18));
    }
}
