package leetcode;

import java.util.*;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        for (int v : nums1) {
            l.add(v);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (l.contains(nums2[i])) {
                ans.add(nums2[i]);

                l.remove(l.indexOf(nums2[i]));
            }
        }
        int a[] = new int[ans.size()];
        int i = 0;
        for (int v : ans) {
            a[i++] = v;
        }
        return a;

    }
}
