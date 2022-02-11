package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            sp--;
        }
        sp = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            sp++;
        }
    }
}

/*
 * 
 * * *
 * * * * *
 * * *
 * 
 */
