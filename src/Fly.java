import java.util.Scanner;

public class Fly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceAB = scanner.nextInt();
        int distanceBC = scanner.nextInt();
        int weight = scanner.nextInt();
        scanner.close();

        final int MAX_FUEL = 300;
        double fuelConsumption = getFuelConsumption(weight);

        if (fuelConsumption == -1) {
            System.out.println("ERROR");
            return;
        }

        double requiredFuelAB = distanceAB * fuelConsumption;
        double requiredFuelBC = distanceBC * fuelConsumption;

        // Проверка: можем ли долетеSlrOpть от A до B
        if (requiredFuelAB > MAX_FUEL) {
            System.out.println("ERROR");
            return;
        }

        // Проверка: можем ли долететь от B до C после полной заправки
        if (requiredFuelBC > MAX_FUEL) {
            System.out.println("ERROR");
            return;
        }

        // Сколько топлива останется в баке после A → B
        double fuelAfterAB = MAX_FUEL - requiredFuelAB;

        // Рассчитываем, сколько нужно дозаправить в B
        double additionalFuelNeeded = Math.max(0, requiredFuelBC - fuelAfterAB);

        System.out.printf("%.2f%n", additionalFuelNeeded);
    }

    private static double getFuelConsumption(int weight) {
        if (weight > 2000) return -1; // Самолёт не может взлететь
        if (weight > 1500) return 9.0;
        if (weight > 1000) return 7.0;
        if (weight > 500) return 4.0;
        return 1.0;
    }
}
