import java.util.Scanner;

public class Piramidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        for(int i = width; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        scanner.close();
    }
}
