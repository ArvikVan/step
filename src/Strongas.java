import java.util.Scanner;

public class Strongas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String codeWord = input.nextLine();
        String res = str.replaceAll("\\b" + codeWord + "\\b", " ");
        res = res.trim().replaceAll("\\s+"," ");
        System.out.println(res);

    }
}
