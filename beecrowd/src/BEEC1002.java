import java.util.Scanner;

public class BEEC1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение значения радиуса
        double R = sc.nextDouble();

        // Вычисление площади
        double A = 3.14159 * R * R;

        // Вывод результата с 4 знаками после запятой
        System.out.printf("A=%.4f\n", A);
    }
}
