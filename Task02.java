import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String age = getLine("Введите ваш возраст", scanner);
            System.out.printf("Ваш возраст %d", Integer.parseInt(age));
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод");
        }
    }

    public static String getLine(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
