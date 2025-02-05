import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод координат первой точки
        String[] firstPoint = scanner.nextLine().split(" ");
        double x1 = Double.parseDouble(firstPoint[0]);
        double y1 = Double.parseDouble(firstPoint[1]);

        // Ввод координат второй точки
        String[] secondPoint = scanner.nextLine().split(" ");
        double x2 = Double.parseDouble(secondPoint[0]);
        double y2 = Double.parseDouble(secondPoint[1]);

        // Рассчет расстояний до начала координат
        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);

        // Сравнение расстояний и вывод результата
        if (d1 < d2) {
            System.out.println("Первая точка ближе");
        } else if (d1 > d2) {
            System.out.println("Вторая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }

        scanner.close();
    }

}