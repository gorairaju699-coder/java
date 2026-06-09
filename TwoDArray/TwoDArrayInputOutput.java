import java.util.*;

public class TwoDArrayInputOutput {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int number[][] = new int[m][n];

        // Input
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
