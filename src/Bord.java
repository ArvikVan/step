import java.util.Scanner;
public class Bord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        int sum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            sum += smallestDivisor(i);
        }

        System.out.println(sum);
    }

    // Метод для нахождения наименьшего делителя числа, начиная с 2
    private static int smallestDivisor(int number) {
        // Ищем делители начиная с 2
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return i; // Возвращаем наименьший делитель
            }
        }
        return number; // Если число простое, возвращаем его само
    }
}
