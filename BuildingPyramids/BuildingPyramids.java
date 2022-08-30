import java.util.Scanner;

public class BuildingPyramids {
    public static void main(String[] args) {
        // pyramid of various layers
        // layer 1 = 1
        // layer 2 = 9
        // layer 3 = 35
        // 
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
