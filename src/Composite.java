import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            if (isComposite(i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("NO");
    }

    // Функция для проверки, является ли число составным
    private static boolean isComposite(int num) {
        if (num < 2) return false; // 1 не является составным числом

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
            if (count > 2) return true; // Если нашли больше двух делителей, это составное число
        }
        return false;
    }
}
