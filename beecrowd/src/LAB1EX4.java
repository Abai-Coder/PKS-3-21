import java.text.DecimalFormat;

public class LAB1EX4 {
    public static void main(String[] args) {
        int minutesUsed = 60;
        int messagesUsed = 55;

        calculatePhoneBill(minutesUsed, messagesUsed);
    }

    public static void calculatePhoneBill(int minutesUsed, int messagesUsed) {
        double baseCost = 15.00;
        int includedMinutes = 50;
        int includedMessages = 50;
        double costPerExtraMinute = 0.25;
        double costPerExtraMessage = 0.15;
        double supportFee = 0.44;
        double taxRate = 0.05;

        int extraMinutes = Math.max(0, minutesUsed - includedMinutes);
        int extraMessages = Math.max(0, messagesUsed - includedMessages);

        double extraMinutesCost = extraMinutes * costPerExtraMinute;
        double extraMessagesCost = extraMessages * costPerExtraMessage;

        double subtotal = baseCost + extraMinutesCost + extraMessagesCost + supportFee;
        double tax = subtotal * taxRate;
        double totalCost = subtotal + tax;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Базовая стоимость: $" + df.format(baseCost));
        if (extraMinutes > 0) {
            System.out.println("Дополнительные минуты: $" + df.format(extraMinutesCost) + " (" + extraMinutes + " минут)");
        }
        if (extraMessages > 0) {
            System.out.println("Дополнительные сообщения: $" + df.format(extraMessagesCost) + " (" + extraMessages + " сообщений)");
        }
        System.out.println("Сбор за 911: $" + df.format(supportFee));
        System.out.println("Налог: $" + df.format(tax));
        System.out.println("Итоговая сумма: $" + df.format(totalCost));
    }
}
