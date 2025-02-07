import java.util.Scanner;

/**
 * Пользователь вводит три строки, которые содержат части кодового слова. Каждая вводимая строка может содержать пробелы и заканчивается символом перехода на новую строку ('\n').
 *
 * Части кодового слова выделены внутри строки знаками ';'. Нужно соединить эти части в одну строку и вывести эту строку на консоль.
 */
public class Stringes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder codeword = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            int firstIndex = line.indexOf(';');
            int lastIndex = line.lastIndexOf(';');

            if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
                codeword.append(line, firstIndex + 1, lastIndex);
            }
        }

        System.out.println(codeword.toString());

        sc.close();

    }
}
