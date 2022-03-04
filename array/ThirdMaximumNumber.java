package array;

import java.util.*;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int nums[] = { 3, 1 };
        int[] sorted = Arrays.stream(nums).sorted().distinct().toArray();
        if (sorted.length == 2) {
            System.out.println(sorted[sorted.length - 1]);
        } else if (sorted.length == 1) {
            System.out.println(sorted[0]);
        } else {
            System.out.println(sorted[sorted.length - 3]);
        }
    }
}
