import java.util.Scanner;

public class Greetings {
    private String q;
    private String a;

    public void setQuestion() {
        Scanner sc = new Scanner(System.in);
        q = sc.nextLine();
        sc.close();
    }

    public void getAnswer() {
        if (!q.isEmpty()) {
            int howLong = q.length();
            howLong -= 2;
            howLong *= 2;
            a = "h" + "e".repeat(howLong) + "y";
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Greetings newG = new Greetings();
        newG.setQuestion();
        newG.getAnswer();
    }
}