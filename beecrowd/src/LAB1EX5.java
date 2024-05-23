public class LAB1EX5 {
    public static void main(String[] args) {
        String[] transactions = {
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        };

        int totalBalance = calculateBalance(transactions);

        System.out.println("Итоговая сумма на счету составляет " + totalBalance + ".");
    }

    public static int calculateBalance(String[] transactions) {
        int balance = 0;

        for (String transaction : transactions) {
            String[] parts = transaction.split("~");
            if (parts.length > 1) {
                String amountStr = parts[1].trim();
                try {
                    int amount = Integer.parseInt(amountStr);
                    balance += amount;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат суммы в транзакции: " + transaction);
                }
            }
        }

        return balance;
    }
}
