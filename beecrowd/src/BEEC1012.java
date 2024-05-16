import java.util.Scanner;

public class BEEC1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение трех вещественных чисел
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Вычисление площади треугольника (A * C / 2)
        double TRIANGULO = (A * C) / 2.0;

        // Вычисление площади круга (pi * C^2)
        double pi = 3.14159;
        double CIRCULO = pi * Math.pow(C, 2);

        // Вычисление площади трапеции ((A + B) * C / 2)
        double TRAPEZIO = ((A + B) * C) / 2.0;

        // Вычисление площади квадрата (B^2)
        double QUADRADO = Math.pow(B, 2);

        // Вычисление площади прямоугольника (A * B)
        double RETANGULO = A * B;

        // Вывод результатов
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
    }
}
