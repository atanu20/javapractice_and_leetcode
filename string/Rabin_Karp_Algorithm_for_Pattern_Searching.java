package string;

public class Rabin_Karp_Algorithm_for_Pattern_Searching {
    static int d = 256, q = 101;

    public static void main(String[] args) {
        // String txt = "AABAACAADAABAABA";
        // String pat = "AABA";

        // boolean check = true;
        // int c = 0;
        // while (check) {
        // int i = txt.indexOf(pat);

        // if (i < 0) {
        // check = false;

        // } else {
        // if (c == 0)
        // System.err.println(i);
        // else {
        // System.err.println(i + pat.length());
        // }
        // txt = txt.substring(i + pat.length());
        // // txt = txt.replaceFirst(pat, "****");
        // System.out.println(txt);
        // }
        // c++;

        // }

        String txt = "AABAACAADAABAABA";
        String pat = "AABA";

        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }

    }
}
