import java.util.HashSet;
import java.util.Set;

public class Twononrepeatingelements {
    public static void main(String[] args) {
        int a[] = { 2, 4, 7, 9, 2, 4 };
        int sum = 0;
        for (int i : a) {
            sum ^= i;
        }
        // System.out.println(sum);

        int sum1 = 0;
        int sum2 = 0;
        sum = sum & -sum;
        for (int i : a) {
            if ((sum & i) > 0) {
                sum1 ^= i;
            } else {
                sum2 ^= i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        HashSet<Integer> s = new HashSet<>();
        for (int i : a) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        System.out.println(s);

    }

}
