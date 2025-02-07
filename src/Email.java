import java.util.Objects;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isGMailAddress(String str) {
        if(!(str.indexOf('@') != -1 && str.indexOf('@') == str.lastIndexOf('@'))) {
            return false;
        }
        String[] parts = str.split("@");
        if(Objects.equals(parts[0], "")){
            return false;
        }
        return parts[1].equals("gmail.com");
    }
}
