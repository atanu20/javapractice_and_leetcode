package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
            sp++;
        }
    }
}

// ****
// ***
// **
// *