import java.util.Scanner;

/**
 * The Quality-Adjusted Life-Year (QALY) a way to measure a person's quality of
 * life, including quality (0-1) quantity of life lived
 */

public class QualityAdjustedLifeYear {

    public QualityAdjustedLifeYear() {
    }

    public static void main(String[] args) {
        QualityAdjustedLifeYear newQaly = new QualityAdjustedLifeYear();
        newQaly.getQaly();
    }

    public void getQaly() {
        double QALY = 0, N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String[] splitNumbers = sc.nextLine().split(" ");
            QALY += Double.parseDouble(splitNumbers[0]) * Double.parseDouble(splitNumbers[1]);
        }
        sc.close();
        System.out.println(QALY);
    }
}