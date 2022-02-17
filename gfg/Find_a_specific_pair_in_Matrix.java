package gfg;

public class Find_a_specific_pair_in_Matrix {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int n = 5;

        int mat[][] = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 6, 1, 3 }, { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int a = i + 1; a < n; a++) {
                    for (int b = j + 1; b < n; b++) {
                        if (max < (mat[a][b] - mat[i][j])) {
                            max = (mat[a][b] - mat[i][j]);
                        }
                    }
                }
            }

        }
        System.out.println(max);
    }
}
