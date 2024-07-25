import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = console.nextInt();
        System.out.println("Введите число b: ");
        int b = console.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        int plus = a + b;
        int minus = a - b;
        int multiply = a * b;

        System.out.println("a - b = " + plus);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + multiply);
        if (b == 0) {
            System.out.println("Делить на 0 нельзя!");
        } else {
            float divided = a / b;
            System.out.println("a / b = " + divided);
        }
    }
}