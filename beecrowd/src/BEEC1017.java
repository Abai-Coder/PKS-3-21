import java.util.Scanner;

public class BEEC1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение расстояния между автомобилями
        int distance = sc.nextInt();

        // Вычисление времени, необходимого для того, чтобы автомобиль Y догнал автомобиль X
        int time = distance * 2; // Время в минутах (1 км/2 минуты)

        // Вывод результата
        System.out.println(time + " minutos");
    }
}
