import java.util.Scanner;

public class Debugg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade, count = 0;
        double sum = 0;

        while (true) {
            grade = scan.nextInt();
            if (grade < 0) {
                break;
            }
            sum += grade;
            count++;
        }
        scan.close();

        if (count > 0) {
            double average = sum / count;
            System.out.printf("%.1f%n", average);
        } else {
            System.out.println("No data");
        }

    }
}
