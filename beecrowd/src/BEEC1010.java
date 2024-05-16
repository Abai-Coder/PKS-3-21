import java.util.Scanner;

public class BEEC1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение данных о продукте 1
        int code1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double price1 = sc.nextDouble();

        // Чтение данных о продукте 2
        int code2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double price2 = sc.nextDouble();

        // Вычисление общей стоимости
        double total = quantity1 * price1 + quantity2 * price2;

        // Вывод результата
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
