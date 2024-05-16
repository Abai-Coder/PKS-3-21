import java.util.Scanner;

public class BEEC1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение имени продавца, его фиксированной зарплаты и общей суммы продаж
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        // Вычисление общей зарплаты продавца с учетом бонуса за продажи
        double totalSalary = salary + (totalSales * 0.15);

        // Вывод результата
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
    }
}

