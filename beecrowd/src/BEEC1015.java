import java.util.Scanner;

public class BEEC1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение координат двух точек
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Вычисление расстояния между точками по формуле
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Вывод результата с четырьмя знаками после запятой
        System.out.printf("%.4f\n", distance);
    }
}
