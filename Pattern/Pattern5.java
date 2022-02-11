package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0, po = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < po; j++) {
                c = a + b;
                System.out.print(" " + a + " ");
                a = b;
                b = c;

            }
            po++;
            System.out.println();
        }
    }
}
