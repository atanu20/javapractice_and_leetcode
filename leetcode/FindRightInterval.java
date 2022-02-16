package leetcode;

public class FindRightInterval {
    public static int checkInterval(int[][] arr, int key, int len) {
        for (int i = 0; i < len; i++) {
            if (key == arr[i][0])
                return i;
        }
        for (int i = 0; i < len; i++) {
            if (key < arr[i][0])
                return i;
        }
        return -1;
    }

    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int result[] = new int[n];

        if (n == 1)
            return new int[] { -1 };

        for (int i = 0; i < n; i++) {
            result[i] = checkInterval(intervals, intervals[i][1], n);
        }
        return result;
    }
}
