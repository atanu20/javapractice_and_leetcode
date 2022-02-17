package gfg;

import java.util.*;

public class Common_elements_in_all_rows_of_a_given_matrix {
    public static void main(String[] args) {

        int mat[][] = {
                { 1, 2, 1, 4, 8 },
                { 3, 7, 8, 5, 1 },
                { 8, 7, 7, 3, 1 },
                { 8, 1, 2, 7, 9 },
        };

        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < m; i++) {
            map.put(mat[0][i], 1);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map.get(mat[i][j]) != null && map.get(mat[i][j]) == i) {
                    map.put(mat[i][j], i + 1);

                    if (i == n - 1) {
                        System.out.println(mat[i][j]);
                    }
                }

            }

        }

    }
}
