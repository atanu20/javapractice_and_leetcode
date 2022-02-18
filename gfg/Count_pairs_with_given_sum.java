package gfg;

import java.util.*;

public class Count_pairs_with_given_sum {
    int getPairsCount(int[] arr, int n, int k) {
        // int pair=0;
        // for(int i=0;i<n-1;i++)
        // {
        // for(int j=i+1;j<n;j++)
        // {
        // if(arr[i]+arr[j]==k)
        // {
        // pair++;
        // }
        // }
        // }
        // return pair;

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (m.containsKey(k - arr[i])) {
                count += m.get(k - arr[i]);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        return count;
    }
}
