package array;

public class CeilandFloor {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70 };
        int n = a.length;
        int k = 35;

        // first method
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int cval = 0, fval = 0;
        for (int i = 0; i < n; i++) {
            int val = k - a[i];
            if (k == a[i]) {
                fval = a[i];
                cval = a[i];
                break;
            } else {
                if (val > 0 && min > val) {
                    min = val;
                    fval = a[i];
                } else if (val < 0 && max < val) {
                    max = val;
                    cval = a[i];
                }
            }

        }
        System.out.println(fval + " " + cval);

        // 2nd method

        int low = 0;
        int high = n - 1;
        int ceil = 0, floor = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                ceil = a[mid];
                floor = a[mid];
                break;
            } else if (a[mid] > k) {

                high = mid - 1;
                ceil = a[mid];
            } else {
                low = mid + 1;
                floor = a[mid];
            }
        }
        System.out.println(floor + " " + ceil);

    }
}
