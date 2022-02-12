package array;

// https://nados.io/question/bar-chart
import java.util.*;

public class BarChart {
    public static void main(String[] args) {
        int a[] = { 3, 1, 0, 7, 5 };
        int n = 5;
        // Arrays.sort(a);
        // int max = a[n - 1];
        // System.out.println(max);
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (a[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
