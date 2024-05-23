import java.util.List;

public class LAB1EX2 {
    public static void main(String[] args) {
        System.out.println(finalState(List.of("Dislike"))); // Вывод: "Dislike"
        System.out.println(finalState(List.of("Like", "Like"))); // Вывод: "Nothing"
        System.out.println(finalState(List.of("Dislike", "Like"))); // Вывод: "Like"
        System.out.println(finalState(List.of("Like", "Dislike", "Dislike"))); // Вывод: "Nothing"
        System.out.println(finalState(List.of("Like", "Dislike", "Like"))); // Вывод: "Like"
        System.out.println(finalState(List.of("Dislike", "Dislike"))); // Вывод: "Nothing"
        System.out.println(finalState(List.of("Like", "Dislike", "Dislike", "Like", "Like"))); // Вывод: "Nothing"
        System.out.println(finalState(List.of("Dislike", "Like", "Dislike", "Like", "Dislike"))); // Вывод: "Dislike"
        System.out.println(finalState(List.of())); // Вывод: "Nothing"
        System.out.println(finalState(List.of("Like"))); // Вывод: "Like"
        System.out.println(finalState(List.of("Dislike", "Like", "Like", "Dislike", "Dislike"))); // Вывод: "Nothing"
    }

    public static String finalState(List<String> actions) {
        if (actions.isEmpty()) {
            return "Nothing";
        }

        String state = "Nothing";

        for (String action : actions) {
            if (state.equals(action)) {
                state = "Nothing"; // Отмена действия
            } else {
                state = action; // Переключение состояния
            }
        }

        return state;
    }
}
