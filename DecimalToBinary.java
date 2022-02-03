import java.util.*;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int a, r;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        a = s.nextInt();
        List<Integer> t = new ArrayList<>();

        while (a > 0) {

            r = a % 2;
            t.add(r);
            a = a / 2;

        }
        int k = t.size();
        for (int i = 0; i < k; i++) {
            System.out.print(t.get(k - i - 1));
        }

    }
}
