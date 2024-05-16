import java.util.Scanner;

public class BEEC1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение общего расстояния и общего объема топлива
        int distance = sc.nextInt();
        double fuel = sc.nextDouble();

        // Вычисление среднего потребления топлива
        double averageConsumption = distance / fuel;

        // Вывод результата с тремя знаками после запятой
        System.out.printf("%.3f km/l\n", averageConsumption);
    }
}
