package function;

import java.util.Scanner;

public class oddeven {

    public static boolean evenodd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean result = evenodd(a);

        System.out.println(result);

        sc.close();
    }
}
