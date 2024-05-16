import java.util.Scanner;

public class BEEC1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение входных данных (суммы денег)
        int money = sc.nextInt();

        // Вывод введенной суммы
        System.out.println(money);

        // Вычисление количества каждого типа банкнот
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        for (int note : banknotes) {
            int quantity = money / note;
            System.out.println(quantity + " nota(s) de R$ " + note + ",00");
            money %= note;
        }
    }
}
