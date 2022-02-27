package gfg;

import java.util.Arrays;

public class minimum_num_swap_to_sort_1toN {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 1, 5 };
        int n = a.length;
        int i = 0;
        int count = 0;
        while (i < n) {
            int cu = a[i] - 1;
            if (a[i] != a[cu]) {
                int t = a[i];
                a[i] = a[cu];
                a[cu] = t;
                count++;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
