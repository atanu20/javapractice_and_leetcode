package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int sp = n / 2;
        int po = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                if (i == n / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < po; j++) {
                System.out.print("*\t");
            }
            if (i + 1 <= n / 2) {
                po++;
            } else {
                po--;
            }
            System.out.println();
        }

    }
}
