import java.util.Scanner;

/**
 * The Quality-Adjusted Life-Year (QALY) a way to measure a person's quality of
 * life, including quality (0-1) quantity of life lived
 */

public class QualityAdjustedLifeYear_Improved {

    public QualityAdjustedLifeYear_Improved() {
    }

    public static void main(String[] args) {
        QualityAdjustedLifeYear_Improved newQaly = new QualityAdjustedLifeYear_Improved();
        newQaly.getQaly();
    }

    public void getQaly() {
        double QALY = 0;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            double q = sc.nextDouble(), y = sc.nextDouble();
            QALY += q * y;
        }
        sc.close();
        System.out.println(QALY);
    }
}