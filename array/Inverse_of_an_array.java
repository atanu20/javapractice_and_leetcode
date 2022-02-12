package array;

public class Inverse_of_an_array {
    public static void main(String[] args) {
        int a[] = { 3, 4, 1, 2, 0 };
        int inv[] = new int[a.length];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            inv[a[i]] = i;
        }
        for (int i : inv) {
            System.out.print(i + " ");
        }
    }
}
