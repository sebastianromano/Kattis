import java.util.Scanner;

/*
 * split ;
 * [left side of ;] && [right side of ;]
 * 
 * split -
 * [left side of -] && [right side of -]
 * 
 * Example input: 1-3;    5;7;     10-13
 */

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().replace(" ", "").split(";");
        sc.close();
        int counter = 0;
        for (String stringObj : inputArr) {
            counter++;
            if (stringObj.contains("-")) {
                counter++;
                String[] newString = stringObj.split("-");
                int left = Integer.parseInt(newString[0]); // cast string to int (left)
                int right = Integer.parseInt(newString[1]); // cast string to int (right)
                for (int i = ++left; i < right; i++) { // get int values from one int to another int, w/o [left] [right]
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}