import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() != 6 || !input.matches("-?\\d{6}")) {
            System.out.println("ERROR");
            return;
        }

        int number = Integer.parseInt(input);
        int absNumber = Math.abs(number); // Используем модуль

        // Разделяем на цифры
        int firstHalfSum = absNumber / 100000 + (absNumber / 10000) % 10 + (absNumber / 1000) % 10;
        int secondHalfSum = (absNumber / 100) % 10 + (absNumber / 10) % 10 + absNumber % 10;

        if (firstHalfSum == secondHalfSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
