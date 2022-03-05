package array;

import java.util.*;

public class Sort_Integers_by_The_Number_of_1_Bits {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = setBitCount(arr[i]) * 10001 + arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }
        return arr;
    }

    public int setBitCount(int n) {
        int count = 0;
        while (n > 0) {
            int last_bit = n & 1;
            count += last_bit;
            n = n >> 1;
        }
        return count;
    }
}
