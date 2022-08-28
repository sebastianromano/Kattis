import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); sc.close();
        word = word.substring(word.indexOf("a"), word.length());
        System.out.println(word);
    }
}