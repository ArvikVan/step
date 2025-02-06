import java.util.Random;
import java.util.Scanner;

public class RandomT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        double[] randomDoubles = new double[size];
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            randomDoubles[i] = random.nextDouble() * 5;
        }
        for (double value : randomDoubles) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
        double sum = 0;
        for (double value : randomDoubles) {
            sum += value;
        }
        double average = sum / size;
        System.out.printf("%.2f\n", average);
        for (int i = 0; i < size; i++) {
            if (randomDoubles[i] > average) {
                randomDoubles[i] = average;
            }
        }
        for (double value : randomDoubles) {
            System.out.printf("%.2f ", value);
        }
    }
}
