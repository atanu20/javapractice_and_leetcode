package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int ps = n - 1;
        int po = 2;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < po; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < ps - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ps - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < po; j++) {
                System.out.print("*");
            }
            System.out.println();
            ps--;
            po++;
        }
    }
}
