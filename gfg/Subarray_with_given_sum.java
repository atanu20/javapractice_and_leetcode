package gfg;

import java.util.*;

public class Subarray_with_given_sum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < n) {
            sum += arr[right];
            while (sum > s) {
                sum -= arr[left];
                left++;
            }
            if (sum == s) {
                list.add(left + 1);
                list.add(right + 1);
                return list;
            }
            right++;
        }
        list.add(-1);
        return list;
    }
}
