import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        if (parts.length != 2) {
            System.out.println("ERROR");
            return;
        }

        int height, width;
        try {
            height = Integer.parseInt(parts[0]);
            width = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            System.out.println("ERROR");
            return;
        }

        if (height <= 0 || width <= 0) {
            System.out.println("ERROR");
            return;
        }

        // Рисуем рамку
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                // Первая и последняя строки
                System.out.println("*".repeat(width));
            } else {
                // Средние строки
                System.out.println("*" + " ".repeat(width - 2) + "*");
            }
        }

        scanner.close();
    }
}
