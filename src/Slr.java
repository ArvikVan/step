import java.util.Scanner;

public class Slr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        int hoursWorked = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();
        scanner.close();
        // Проверка на отрицательные значения
        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("ERROR");
            return;
        }

        // Расчет зарплаты
        double salary;

        if (hoursWorked <= 20) {
            salary = hoursWorked * hourlyRate;
        } else if (hoursWorked <= 40) {
            salary = 20 * hourlyRate + (hoursWorked - 20) * hourlyRate * 1.5;
        } else {
            salary = 20 * hourlyRate + 20 * hourlyRate * 1.5 + (hoursWorked - 40) * hourlyRate * 2;
        }

        // Вывод зарплаты, округленной до двух знаков после запятой
        System.out.printf("%.2f\n", salary);
    }
}
