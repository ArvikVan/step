import java.util.Scanner;

public class TwoTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        double middle = (first + second)/2.0;
        int secondTeamFirst = input.nextInt();
        int secondTeamSecond = input.nextInt();
        int secondTeamThird = input.nextInt();
        int secondTeamForth = input.nextInt();
        double secondTeamMiddle = (secondTeamFirst + secondTeamSecond + secondTeamThird + secondTeamForth)/4.0;
        if (middle > secondTeamMiddle) {
            System.out.println("First");
        } else if (middle < secondTeamMiddle) {
            System.out.println("Second");
        } else {
            System.out.println("Draw");
        }
    }
}
