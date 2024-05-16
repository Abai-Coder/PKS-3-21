import java.util.Scanner;

public class BEEC1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение трех оценок студента
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Вычисление среднего значения с весами
        double MEDIA = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
