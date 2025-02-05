import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Если делится на i, не является простым
            }
        }
        return true; // Если не нашли делителей, число простое
    }
}
