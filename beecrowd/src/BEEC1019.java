import java.util.Scanner;

public class BEEC1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение длительности события в секундах
        int durationInSeconds = sc.nextInt();

        // Вычисление часов, минут и секунд
        int hours = durationInSeconds / 3600;
        int remainingSeconds = durationInSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Вывод результата
        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    }
}
