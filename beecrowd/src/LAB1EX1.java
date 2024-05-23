import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LAB1EX1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);

        List<Integer> result = removeOddOccurrences(numbers);

        System.out.println(result);  // Вывод: [1, 1]
    }

    public static List<Integer> removeOddOccurrences(List<Integer> numbers) {
        // Подсчитываем количество каждого числа в списке
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Формируем новый список, содержащий только числа с четным количеством повторений
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (countMap.get(number) % 2 == 0) {
                result.add(number);
            }
        }

        return result;
    }
}
