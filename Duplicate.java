import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 2, 2 };
        List<Integer> l = new ArrayList<Integer>();
        int t = 0;
        // for (int i : a) {
        // l.add(i);
        // }
        for (int i = 0; i < a.length; i++) {
            if (!l.contains(a[i])) {
                l.add(a[i]);
            } else {
                t = a[i];
            }
        }

        System.out.println(t);
    }
}
