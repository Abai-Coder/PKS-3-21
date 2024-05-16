import java.util.Scanner;

public class BEEC1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение коэффициентов квадратного уравнения
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Вычисление дискриминанта
        double delta = B * B - 4 * A * C;

        // Проверка возможности вычисления корней
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Вычисление корней
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Вывод результатов
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
