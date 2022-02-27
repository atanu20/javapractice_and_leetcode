package gfg;

public class minimum_swap_adjacent_swaping {
    static int total = 0;

    public static boolean checksort(int[] arr) {
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                c++;
            }
        }
        return n == c + 1 ? true : false;
    }

    public static void totalSort(int[] a, int n) {
        if (checksort(a)) {
            System.out.println(total);

        } else {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                    total++;
                }
            }
            totalSort(a, n);

        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 3, 4, 2, 5, 7, 9, 11 };
        int n = a.length;
        totalSort(a, n);
        // 0, 0, 1, 0, 1, 0, 1, 1

    }
}
