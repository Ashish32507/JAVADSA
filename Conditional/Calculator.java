package Conditional;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number :");
        int a = sc.nextInt();

        System.out.print("Enter The Second Number :");
        int b = sc.nextInt();

        System.out.print("Enter The Operator  :");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.print("Addition Is : " + (a + b));
                break;
            case '-':
                System.out.print("Subtraction Is : " + (a - b));
                break;
            case '/':
                System.out.print("Division Is : " + (a / b));
                break;
            case '%':
                System.out.print("Modulo Is : " + (a % b));
                break;
            case '*':
                System.out.print("Multiplication Is : " + (a * b));
                break;
            default:
                System.out.print("My Calculator Is Not Advance");
                break;
        }
    }
}
