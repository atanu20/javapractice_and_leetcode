package leetcode;

import java.util.*;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;

        for (int v : nums1) {
            s.add(v);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (s.contains(nums2[i])) {
                ans.add(nums2[i]);
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
