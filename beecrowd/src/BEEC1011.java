import java.util.Scanner;

public class BEEC1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение радиуса сферы
        double R = sc.nextDouble();

        // Вычисление объема сферы
        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * Math.pow(R, 3);

        // Вывод результата
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
