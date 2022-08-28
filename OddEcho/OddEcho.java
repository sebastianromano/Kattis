import java.util.ArrayList;
import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfWords = Integer.parseInt(sc.nextLine()); // solve Scanner NextLine skipping issue
        ArrayList<String> listOfWords = new ArrayList<String>();

        while (listOfWords.size() < noOfWords) { // insert all words to list
            String word = sc.nextLine();
            listOfWords.add(word);
        }

        int counter = 0; // simple counter of the number of lines in list
        for (String string : listOfWords) { // printing out every second line of input
            if (counter % 2 == 0) {
                System.out.println(string);
            }
            counter++;
        }
        sc.close();
    }
}