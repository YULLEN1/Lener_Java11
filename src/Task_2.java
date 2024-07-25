import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = console.nextLine();
        System.out.print("Введите строку b: ");
        String b = console.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны!");
        } else {
            System.out.println("Строки неидентичны!");
        }
    }
}