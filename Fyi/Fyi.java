import java.util.Scanner;

public class Fyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine().substring(0, 3);
        sc.close();
        if (numbers.contains("555")) {
            System.out.println("1");
        } else {
            System.out.println(0);
        }
    }
}
