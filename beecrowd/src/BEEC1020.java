import java.util.Scanner;

public class BEEC1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение возраста в днях
        int ageInDays = sc.nextInt();

        // Вычисление количества лет, месяцев и дней
        int years = ageInDays / 365;
        int remainingDays = ageInDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        // Вывод результата
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
