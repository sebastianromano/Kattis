import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        // 1-3;5;7;10-13

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input.split(";");
        sc.close();
        System.out.print(input);
    }
}