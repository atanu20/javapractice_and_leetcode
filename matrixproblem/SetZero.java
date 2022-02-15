package matrixproblem;

public class SetZero {
    public static void main(String[] args) {
        int mat[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int n = mat.length;
        int m = mat[0].length;

        int row = 0;
        int col = 0;

        for (int i = 0; i < n; i++)
            if (mat[i][0] == 0)
                row = 1;

        for (int i = 0; i < m; i++)
            if (mat[0][i] == 0)
                col = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0; // col zero
                    mat[i][0] = 0; // row zero
                }
            }
        }
        // col zero
        for (int i = 1; i < n; i++) {
            if (mat[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = 0;
                }
            }
        }
        // row zero
        for (int i = 1; i < m; i++) {
            if (mat[0][i] == 0) {
                for (int j = 0; j < n; j++) {
                    mat[j][i] = 0;
                }
            }
        }

        if (col == 1) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }

        if (row == 1) {
            for (int i = 0; i < m; i++) {
                mat[0][i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
