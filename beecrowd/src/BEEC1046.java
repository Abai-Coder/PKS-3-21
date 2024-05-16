import java.util.Scanner;

public class BEEC1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read start and end time of the game
        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        // Calculate the duration of the game
        int duration;
        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        // Print the duration of the game
        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
}
