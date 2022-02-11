package Pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 4;
        int sp = 2 * n - 3;
        int st = 1;

        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j < st; j++) {
                System.out.print(val);
                val++;
            }
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");

            }

            if (i == n - 1) {
                st--;
                val--;
            }

            for (int j = 0; j < st; j++) {
                val--;
                System.out.print(val);
            }

            sp = sp - 2;
            st++;
            System.out.println();
        }
    }
}
