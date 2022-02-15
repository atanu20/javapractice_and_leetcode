package leetcode;

import java.util.*;

public class FindKthPositive {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> ad = new ArrayList<>();
        List<Integer> check = new ArrayList<>();
        int n = arr.length;
        for (int v : arr) {
            check.add(v);
        }

        for (int i = 1; i <= 2 * 1000; i++) {
            if (!check.contains(i)) {
                ad.add(i);
            }
        }
        // k=kad.size();
        return ad.get(k - 1);

        // 2nd

        // if(arr[0]>k)
        // return k;
        // int count=k;
        // for(int v:arr)
        // {
        // if(v<=count)
        // {
        // count++;
        // }else{
        // break;
        // }
        // }
        // return count;

        /*
         * 
         * if(arr[0]>k)
         * return k;
         * int count=0;
         * int l=0,h=arr.length-1;
         * 
         * while(l<=h)
         * {
         * int mid=l+(h-l)/2;
         * 
         * if(arr[mid]-(mid+1)<k)
         * {
         * count=mid+1;
         * l=mid+1;
         * }else{
         * h=mid-1;
         * }
         * }
         * return k+count;
         * 
         * 
         */
    }
}
