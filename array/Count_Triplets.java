package array;

import java.util.*;

public class Count_Triplets {

    public static int countWays(int[] arr, int n) {
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;
            int h = i - 1;
            while (l < h) {
                if (arr[l] + arr[h] == arr[i]) {
                    count++;
                    l++;
                    h--;
                } else if (arr[h] + arr[l] < arr[i]) {
                    l++;

                } else {
                    h--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(countWays(arr, n));
    }
}
