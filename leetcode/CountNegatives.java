package leetcode;

public class CountNegatives {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;

        /*
         * int n=grid.length;
         * int m=grid[0].length;
         * int i=0;
         * int j=m-1;
         * int count=0;
         * while(i<n && j>=0)
         * {
         * if(grid[i][j]<0)
         * {
         * count+=n-i;
         * j--;
         * }else{
         * i++;
         * }
         * }
         * return count;
         * 
         * 
         */
    }
}
