import java.util.Scanner;

// change method

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of the addends from the task
        int sum = 0; // sum of the addends from the task
        for (int i = 0; i < n; i++) {
            int addend = sc.nextInt(); // addend from the task
            int lastDigit = addend % 10; // last digit of the addend
            int firstDigits = addend / 10; // first digits of the addend
            sum += Math.pow(firstDigits, lastDigit); // add the result to the sum
        }
        sc.close();
        System.out.println(sum); // print the sum
    }
}
