import java.util.Scanner;

public class BEEC1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение номера сотрудника, отработанных часов и оплаты за час
        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double hourRate = sc.nextDouble();

        // Вычисление зарплаты
        double salary = workedHours * hourRate;

        // Вывод результата
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
