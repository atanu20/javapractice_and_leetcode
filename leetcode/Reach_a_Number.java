package leetcode;

public class Reach_a_Number {
    public int reachNumber(int target) {
        target = Math.abs(target);
        long l = 0, e = target;

        long pos = 0, minstep = 0;

        while (l <= e) {
            long mid = l + (e - l) / 2;
            long dis = (mid * (mid + 1)) / 2;

            if (dis >= target) {
                pos = dis;
                minstep = mid;
                e = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        long diff = pos - target;

        if (diff % 2 != 0) {
            if (minstep % 2 == 0) {
                minstep++;
            } else {
                minstep += 2;
            }
        }
        return (int) minstep;

    }
}
