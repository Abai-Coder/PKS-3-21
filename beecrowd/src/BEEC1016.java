import java.util.Scanner;

public class BEEC1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение расстояния между автомобилями
        int distance = sc.nextInt();

        // Вычисление времени, необходимого для того, чтобы автомобиль Y пройдет это расстояние
        int time = distance * 2;

        // Вывод результата
        System.out.println(time + " minutos");
    }
}

