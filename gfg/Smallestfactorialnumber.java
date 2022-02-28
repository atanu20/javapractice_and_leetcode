package gfg;

public class Smallestfactorialnumber {
    static boolean check(int mid, int n) {
        int c = 0, f = 5;
        while (f <= mid) {
            c += mid / f;
            f = f * 5;
        }
        return (c >= n);
    }

    int findNum(int n) {
        if (n == 1)
            return 5;
        int l = 0;
        int h = 5 * n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (check(mid, n)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
