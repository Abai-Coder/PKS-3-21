import java.util.Scanner;

public class BEEC1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение двух оценок студента
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        // Вычисление среднего значения с весами
        double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
