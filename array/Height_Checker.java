package array;

import java.util.*;

public class Height_Checker {
    public int heightChecker(int[] h) {
        int n = h.length;
        int t[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        // t[i]=h[i];
        // }

        System.arraycopy(h, 0, t, 0, n);
        Arrays.sort(t);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] != t[i]) {
                c++;
            }
        }
        return c;
    }
}
