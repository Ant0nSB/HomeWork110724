import java.util.Scanner;

public class Mein1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Для тестирования используем случайное число от 0 до 28800
        int n = (int) (Math.random() * 28801);  // Генерируем случайное число от 0 до 28800

        System.out.println("Осталось " + n + " секунд до конца рабочего дня.");

        int hoursLeft = n / 3600;

        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов.");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час.");
        } else {
            System.out.println("Осталось менее часа.");
        }
    }
}
