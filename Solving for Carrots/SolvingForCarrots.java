import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] hufflePuffToCarrots = s.split(" ");

        System.out.println(hufflePuffToCarrots[1]);

    }
}