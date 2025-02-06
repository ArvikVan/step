import java.util.Scanner;

public class MinP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества элементов массива
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Ввод элементов массива
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Переменные для поиска последнего минимального элемента
        int minValue = Integer.MAX_VALUE;
        int lastIndex = -1;

        // Находим последний минимальный элемент
        for (int i = 0; i < n; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                lastIndex = i;
            } else if (numbers[i] == minValue) {
                lastIndex = i;
            }
        }

        // Заменяем последний минимальный элемент на -1
        if (lastIndex != -1) {
            numbers[lastIndex] = -1;
        }

        // Выводим преобразованный массив
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
