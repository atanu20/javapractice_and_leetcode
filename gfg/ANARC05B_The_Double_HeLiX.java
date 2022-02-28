package gfg;

import java.util.Scanner;

public class ANARC05B_The_Double_HeLiX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int b[] = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int s1 = 0, s2 = 0;
            int i = 0, j = 0;
            int ans = 0;
            while (i < n && j < m) {
                if (a[i] < b[j]) {
                    s1 += a[i++];
                } else if (a[i] > b[j]) {
                    s2 += b[j++];
                } else {

                    ans = ans + Math.max(s1, s2) + a[i];
                    s1 = s2 = 0;
                    i++;
                    j++;
                }
            }
            while (i < n) {
                s1 += a[i++];
            }
            while (j < m) {
                s2 += b[j++];
            }
            ans = ans + Math.max(s1, s2);
            System.out.println(ans);

        }
    }
}
