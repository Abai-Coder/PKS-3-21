import java.util.Scanner;

public class BEEC1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение трех целых чисел
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Нахождение наибольшего числа
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        // Вывод результата
        System.out.println(maiorABC + " eh o maior");
    }
}
