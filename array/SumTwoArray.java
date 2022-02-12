package array;

public class SumTwoArray {
    public static void main(String[] args) {
        int a[] = { 3, 1, 0, 7, 5 };
        int an = 5;
        // int b[] = { 9, 1, 1, 1, 1 };
        // int bn = 5;

        int b[] = { 1, 1, 1, 1, 1, 1 };
        int bn = 6;

        int sum[] = new int[an > bn ? an : bn];

        int i = an - 1, j = bn - 1;
        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int add = c;
            if (i >= 0)
                add += a[i];

            if (j >= 0)
                add += b[j];

            c = add / 10;
            add = add % 10;

            sum[k] = add;

            i--;
            j--;
            k--;

        }

        if (c != 0) {
            System.out.print(c + " ");
        }

        for (int l = 0; l < sum.length; l++) {
            System.out.print(sum[l] + " ");
        }

    }
}
