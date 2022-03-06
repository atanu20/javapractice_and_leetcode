package array;

import java.util.*;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public boolean canBeEqual(int[] t, int[] arr) {
        Arrays.sort(t);
        Arrays.sort(arr);
        return Arrays.equals(arr, t);
    }
}
