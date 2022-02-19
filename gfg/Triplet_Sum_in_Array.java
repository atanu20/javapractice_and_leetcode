package gfg;

import java.util.*;

public class Triplet_Sum_in_Array {
    public static boolean find3Numbers(int a[], int n, int x) {

        // Set<Integer> set = new HashSet<>();
        // int sum=0,count=0;

        // for(int i=0;i<n;i++){
        // set.add(a[i]);
        // }

        // for(int i=0;i<n-2;i++)
        // {

        // for(int j=i+1;j<n-1;j++)
        // {

        // if(set.contains(x-a[i]-a[j]))
        // {
        // count++;

        // }
        // }
        // }
        // if(count>0)
        // return true;
        // else
        // return false;

        int sum = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {

            int xx = x - a[i];
            int l = i;
            int r = n - 1;

            while (l < r) {

                sum = a[l] + a[r];

                if (sum < xx) {
                    l++;
                } else if (sum > xx) {
                    r--;
                }

                else {
                    return true;
                }
            }

        }

        return false;

    }

}
