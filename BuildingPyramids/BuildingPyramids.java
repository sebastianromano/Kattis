import java.util.Scanner;

// change method

public class BuildingPyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1, layer = 0, block = sc.nextInt();
        while ((block - count * count) >= 0) {
            block -= (count * count);
            count += 2;
            layer++;
        }
        System.out.println(layer); sc.close();
    }
}
