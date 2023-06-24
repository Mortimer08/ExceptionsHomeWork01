import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("out/numbers.txt"));
        String line;
        Integer number;
        Integer sum = 0;
        try {
            while ((line = br.readLine()) != null) {
                number = Integer.parseInt(line);
                sum += number;
            }
            System.out.println("Сумма чисел в файле равна: " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Некорректное значение числа в файле");
        }


    }
}
