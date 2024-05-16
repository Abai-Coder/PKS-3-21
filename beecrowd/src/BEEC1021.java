import java.util.Scanner;

public class BEEC1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение суммы денег
        double amount = sc.nextDouble();

        // Вычисление банкнот
        int[] banknotes = {100, 50, 20, 10, 5, 2};
        System.out.println("NOTAS:");
        for (int note : banknotes) {
            int quantity = (int) (amount / note);
            System.out.println(quantity + " nota(s) de R$ " + note + ".00");
            amount %= note;
        }

        // Вычисление монет
        int[] coins = {100, 50, 25, 10, 5, 1};
        System.out.println("MOEDAS:");
        for (int coin : coins) {
            if (coin >= 100) {
                continue; // Пропускаем монеты, соответствующие банкнотам
            }
            int quantity = (int) (amount / coin);
            System.out.println(quantity + " moeda(s) de R$ " + coin / 100.0);
            amount %= coin;
        }
        // Вывод оставшихся монет
        System.out.printf("%.0f moeda(s) de R$ %.2f\n", amount, amount / 100.0);
    }
}
