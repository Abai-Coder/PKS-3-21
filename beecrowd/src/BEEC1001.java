import java.io.IOException;
import java.util.Scanner;

public class BEEC1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение двух целых чисел
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Вычисление суммы
        int X = A + B;

        // Вывод результата с отступом и переводом строки
        System.out.println("X = " + X);
        System.out.println(); // Перевод строки после результата
    }
}
