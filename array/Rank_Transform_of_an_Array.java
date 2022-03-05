package array;

import java.util.*;

public class Rank_Transform_of_an_Array {
    public int[] arrayRankTransform(int[] arr) {

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();

        int count = 1;
        for (int i = 0; i < copy.length; i++) {
            if ((i == 0) || (copy[i - 1] != copy[i])) {
                map.put(copy[i], count);
                count++;
            }

        }

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
