import java.util.Scanner;

public class Whichisgreater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}