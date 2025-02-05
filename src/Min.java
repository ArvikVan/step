import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();
        int fifth = input.nextInt();
        int min = Math.min(Math.min(Math.min(Math.min(first, second), third), fourth), fifth);
        System.out.println(min);
    }
}
