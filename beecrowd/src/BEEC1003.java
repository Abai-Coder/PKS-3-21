import java.util.Scanner;

public class BEEC1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение двух целых чисел
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Вычисление суммы
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}