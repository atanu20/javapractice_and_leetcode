package array;

public class SubArrayPrint {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // int ps = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                    // ps++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
