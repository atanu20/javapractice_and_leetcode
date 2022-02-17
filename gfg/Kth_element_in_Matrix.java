package gfg;

import java.util.*;

public class Kth_element_in_Matrix {
    public static int kthSmallest(int[][] mat, int n, int k) {
        int min = Integer.MAX_VALUE;
        int a[] = new int[n * n];
        int p = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                a[p++] = mat[i][j];
            }
        }
        Arrays.sort(a);

        return a[k - 1];

    }
}
