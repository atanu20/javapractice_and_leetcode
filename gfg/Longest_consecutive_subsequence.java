package gfg;

import java.util.*;

public class Longest_consecutive_subsequence {
    static int findLongestConseqSubseq(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        int loglen = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                loglen = Math.max(loglen, count);
            } else {
                count = 0;
            }

        }
        return loglen + 1;

    }
}
