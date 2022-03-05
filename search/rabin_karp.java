package search;

public class rabin_karp {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";

        int m = pat.length();
        int n = txt.length();
        int i, j;
        int p = 0, t = 0;
        int h = 1;
        int d = 256, prime = 101;

        for (i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
        }
        for (i = 0; i < m; i++) {
            p = (p * d + pat.charAt(i)) % prime;
            t = (t * d + txt.charAt(i)) % prime;

        }
        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(j + i) != pat.charAt(j))
                        break;
                }
                if (j == m) {
                    System.out.println(i);
                }

            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % prime;
                if (t < 0) {
                    t = t + prime;
                }
            }
        }

    }
}