import java.util.Scanner;

public class BEEC1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read start and end time of the game
        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        // Calculate the duration of the game in minutes
        int startTimeInMinutes = startHour * 60 + startMinute;
        int endTimeInMinutes = endHour * 60 + endMinute;

        int durationInMinutes;
        if (startTimeInMinutes < endTimeInMinutes) {
            durationInMinutes = endTimeInMinutes - startTimeInMinutes;
        } else {
            durationInMinutes = 24 * 60 - startTimeInMinutes + endTimeInMinutes;
        }

        // Calculate the duration in hours and minutes
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;

        // Print the duration of the game
        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
    }
}
