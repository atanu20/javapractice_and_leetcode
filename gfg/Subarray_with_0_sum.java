package gfg;

import java.util.*;
// NOTE IF YOU GET Subarray_with_K_sum THEN ONLY YOU NEED TO CHANGE THIS THINGS res.contains(sum-K)

public class Subarray_with_0_sum {
    static boolean findsum(int arr[], int n) {

        // for(int i=0;i<n;i++)
        // {
        // int sum=0;

        // for(int j=i;j<n;j++)
        // {
        // sum+=arr[j];
        // if(sum==0)
        // return true;
        // }
        // }
        // return false;

        HashSet<Integer> res = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            res.add(sum);// in first step it will add 0
            sum += arr[i];
            if (res.contains(sum))
                return true;
        }
        return false;
    }
}
