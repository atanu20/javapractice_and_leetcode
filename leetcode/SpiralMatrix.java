package leetcode;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int right = n - 1, down = m - 1;
        int dir = 0;
        int p = m * n;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    l.add(matrix[top][i]);

                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    l.add(matrix[i][right]);

                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    l.add(matrix[down][i]);

                }
                down--;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    l.add(matrix[i][left]);

                }
                left++;
            }
            dir = (dir + 1) % 4;

        }

        return l;

    }
}
