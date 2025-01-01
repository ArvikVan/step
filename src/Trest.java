import java.util.Scanner;

public class Trest {
    public static void printTriangle(int width, char symbol) {
        if (width <= 0) {
            System.out.println("ERROR");
            return;
        }
        int height = width / 2; // Количество строк в треугольнике
        if (width % 2 != 0) height++; // Если ширина нечетная, добавляем еще одну строку

        for (int i = 1; i <= height; i++) {
            int spaces = height - i; // Количество пробелов перед символами
            int numSymbols = i * 2 - (width % 2 == 0 ? 0 : 1); // Количество символов в строке

            System.out.print(" ".repeat(spaces)); // Вывод пробелов
            System.out.println(String.valueOf(symbol).repeat(numSymbols)); // Вывод символов
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        String str = scan.next();
        char symbol = str.charAt(0);
        printTriangle(width, symbol);
    }
}
