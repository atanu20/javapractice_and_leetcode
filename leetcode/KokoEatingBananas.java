package leetcode;

public class KokoEatingBananas {
    public static boolean check(int[] piles, int h, int k) {
        int times = 0;
        for (int j = 0; j < piles.length; j++) {
            times += (piles[j] - 1) / k + 1;
            if (times > h)
                break;
        }

        if (times <= h)
            return true;
        return false;
    }

    public int minEatingSpeed(int[] piles, int hr) {

        // int i=0;
        // for( i=1;i<1_000_000_000;i++)
        // {
        // int times=0;
        // for(int j=0;j<piles.length;j++)
        // {
        // times+=(piles[j]-1)/i +1;
        // if(times>h)
        // break;
        // }
        // if(times<=h)
        // break;

        // }
        // return i;

        int l = 1;
        int h = 1000000000;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (check(piles, hr, mid)) {

                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return l;
    }
}
