package gfg;

import java.util.*;

public class Chocolate_Distribution_Problem {
    public long findMinDiff(ArrayList<Long> a, long n, long m) {
        Collections.sort(a);
        long initial = 0;
        long last = m - 1;
        long minDiff = Long.MAX_VALUE;
        // Here we are taking group of m values, and then
        // taking difference of last and initial index
        while (last < n) {
            minDiff = Math.min(minDiff, a.get((int) last) - a.get((int) initial));
            last++;
            initial++;
        }
        return minDiff;
    }
}
