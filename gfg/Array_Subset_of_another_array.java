package gfg;

import java.util.*;

public class Array_Subset_of_another_array {
    public String isSubset(long a1[], long a2[], long n, long m) {
        List<Integer> l = new ArrayList<>();
        for (long v : a1) {
            l.add((int) v);
        }
        int count = 0;
        for (long i : a2) {
            if (l.contains((int) i)) {
                count++;

            } else {
                return "No";
            }
        }

        return count == m ? "Yes" : "No";

    }
}
