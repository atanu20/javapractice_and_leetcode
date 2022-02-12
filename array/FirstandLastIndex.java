package array;

import java.util.ArrayList;
import java.util.List;

public class FirstandLastIndex {
    public static void main(String[] args) {
        int a[] = { 10, 10, 10, 20, 20, 20, 20, 30, 40, 40 };
        int k = 20;
        int first = 0, last = 0;
        int n = a.length;

        // first method
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(a[i]);
        }
        System.out.println(l.indexOf(k) + "  " + l.lastIndexOf(k));
        // System.out.println();

        // 2nd method
        int low = 0;
        int high = n - 1;

        last = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                // last index
                last = mid;
                low = mid + 1;
                // first index
                // first=mid;
                // high=mid-1;
            } else if (a[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        first = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                // last index
                // last = mid;
                // low = mid + 1;
                // first index
                first = mid;
                high = mid - 1;
            } else if (a[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(first + "  " + last);

    }
}
