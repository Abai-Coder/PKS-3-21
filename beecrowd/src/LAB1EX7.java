import java.util.Scanner;

public class LAB1EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.print("Вывод: ");
        if (age % 2 == 0) {
            for (int i = 0; i <= age; i += 2) {
                System.out.print(i);
                if (i < age - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            for (int i = 1; i <= age; i += 2) {
                System.out.print(i);
                if (i < age - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
