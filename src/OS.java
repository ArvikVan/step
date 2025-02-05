import java.util.Scanner;

public class OS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int maxSum = -1;
        int numberWithMaxSum = a;

        for (int i = a; i <= b; i++) {
            int sum = sumOfDigits(i);
            if (sum > maxSum) {
                maxSum = sum;
                numberWithMaxSum = i;
            }
        }

        System.out.println(numberWithMaxSum);
    }

    // Метод для вычисления суммы цифр
    private static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Убираем знак
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
