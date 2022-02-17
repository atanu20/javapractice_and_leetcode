package gfg;

public class Rotate_a_matrix_by_90_degree_in_clockwise {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int row = arr.length;
        int col = arr[0].length;
        int ans[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = arr[j][i];

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][col - 1 - j] + "  ");

            }
            System.out.println();
        }
    }
}
