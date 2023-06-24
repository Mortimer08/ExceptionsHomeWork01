import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = getLine("Введите делимое", scanner);
        Integer number2 = getLine("Введите делитель", scanner);
        try {
            System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль недопустимо");
        }

    }

    public static Integer getLine(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextInt();
    }

}
