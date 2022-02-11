package Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int st = 0;
        int sp = n / 2;
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            int cval = val;
            for (int j = 0; j <= st; j++) {
                System.out.print(cval);
                if (j < st / 2)
                    cval++;
                else
                    cval--;
            }
            if (i < n / 2) {
                st += 2;
                sp--;

            } else {
                st -= 2;
                sp++;

            }
            val++;
            System.out.println();

        }
    }
}
