package array;

public class SubTwoArray {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1 };
        int an = a.length;
        int b[] = { 4, 0, 0, 0 };
        int bn = b.length;

        // here we have to do b-a

        int sum[] = new int[an > bn ? an : bn];
        int i = an - 1, j = bn - 1;
        int k = sum.length - 1;
        int c = 0;
        while (k >= 0) {
            int sub = 0;
            int aval = i >= 0 ? a[i] : 0;
            if (b[j] + c >= aval) {
                sub = b[j] + c - aval;
                c = 0;
            } else {
                sub = b[j] + c + 10 - aval;
                c = -1;
            }
            // sub=sub%10;
            // c=sub/10;
            sum[k] = sub;
            i--;
            j--;
            k--;
        }
        int ind = 0;
        for (int l = 0; l < sum.length; l++) {
            if (sum[l] != 0) {
                ind = l;
                break;
            }
        }
        for (int l = ind; l < sum.length; l++) {

            System.out.print(sum[l] + " ");
        }
    }
}
