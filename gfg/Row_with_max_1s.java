package gfg;

public class Row_with_max_1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        int maxind = -1;
        for (int i = 0; i < n; i++) {
            int one = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    one++;
                }
            }

            if (one > max) {
                max = one;
                maxind = i;
            }

        }
        return maxind;
    }
}
