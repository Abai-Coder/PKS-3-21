import java.util.Scanner;

public class BEEC1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение четырех целых чисел
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Вычисление разности произведений
        int DIFERENCA = A * B - C * D;

        // Вывод результата
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
