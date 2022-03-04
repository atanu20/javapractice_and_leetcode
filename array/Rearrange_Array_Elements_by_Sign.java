package array;

import java.util.*;

public class Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {
        // int n = nums.length;
        // int[] a = new int[n];

        // List<Integer> neg=new ArrayList<>();
        // List<Integer> pos=new ArrayList<>();

        // for(int i=0;i<n;i++)
        // {

        // if(nums[i]>0)
        // {
        // pos.add(nums[i]);

        // }else{
        // neg.add(nums[i]);
        // }

        // }
        // int p=0;
        // for(int i=0;i<n/2;i++)
        // {
        // a[p++]=pos.get(i);
        // a[p++]=neg.get(i);

        // }

        // //System.out.println(even);
        // // System.out.println(odd);

        // return a;

        int[] result = new int[nums.length];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[negativeIndex] = nums[i];
                negativeIndex += 2;
            } else {
                result[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }
        return result;
    }
}
