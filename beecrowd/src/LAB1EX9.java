import java.util.ArrayList;
import java.util.List;

public class LAB1EX9 {
    public static void main(String[] args) {
        int[] hoursWorked = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};

        calculateWorkHours(hoursWorked);
    }

    public static void calculateWorkHours(int[] hoursWorked) {
        int daysInWeek = 5;
        int totalDays = hoursWorked.length;

        List<Integer> weeklyHours = new ArrayList<>();
        int totalWorkedDays = 0;
        int totalWorkedHours = 0;

        int currentWeekHours = 0;

        // Перебираем все дни месяца
        for (int day = 0; day < totalDays; day++) {
            int hours = hoursWorked[day];
            currentWeekHours += hours;

            // Если текущий день последний в неделе или в конце месяца
            if ((day % daysInWeek == daysInWeek - 1) || (day == totalDays - 1)) {
                weeklyHours.add(currentWeekHours);
                currentWeekHours = 0;
            }

            // Если отработан хотя бы 1 час, увеличиваем счетчики
            if (hours > 0) {
                totalWorkedDays++;
                totalWorkedHours += hours;
            }
        }

        double averageDailyHours = totalWorkedDays > 0 ? (double) totalWorkedHours / totalWorkedDays : 0;

        // Вывод результатов
        System.out.println("Часы работы по неделям: " + weeklyHours);
        System.out.printf("Среднее количество часов в день (учитывая только рабочие дни): %.2f%n", averageDailyHours);
    }
}
