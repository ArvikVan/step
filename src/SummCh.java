import java.util.Scanner;

public class SummCh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (Math.abs(number) < 100 || Math.abs(number) >= 1000) {
            System.out.println("ERROR");
        } else {
            int sumOfOddDigits = 0;
            boolean hasOddDigit = false;
            number = Math.abs(number); // Используем модуль

            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    sumOfOddDigits += digit;
                    hasOddDigit = true;
                }
                number /= 10;
            }

            if (hasOddDigit) {
                System.out.println(sumOfOddDigits);
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
