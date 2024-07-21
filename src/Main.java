import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (m):");
        double m = scanner.nextDouble();

        System.out.println("Введите второе число (n):");
        double n = scanner.nextDouble();

        double target = 10.0;
        double distanceM = Math.abs(target - m);
        double distanceN = Math.abs(target - n);

        if (distanceM < distanceN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else {
            System.out.println("Число " + n + " ближе к 10.");
        }
    }
}



