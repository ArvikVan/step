import java.util.Random;
import java.util.Scanner;

public class RandomPa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int[] numbers = new int[size];
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(21) - 5;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Переменные для поиска первого максимального и последнего отрицательного элементов
        int firstMaxIndex = -1;
        int lastNegativeIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                firstMaxIndex = i;
            }
            if (numbers[i] < 0) {
                lastNegativeIndex = i;
            }
        }
        if (firstMaxIndex != -1 && lastNegativeIndex != -1) {
            int temp = numbers[firstMaxIndex];
            numbers[firstMaxIndex] = numbers[lastNegativeIndex];
            numbers[lastNegativeIndex] = temp;
        }

        // Выводим измененный массив
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
