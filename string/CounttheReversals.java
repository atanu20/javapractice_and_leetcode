package string;

public class CounttheReversals {
    public static void main(String[] args) {
        String st = "}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}";

        int n = st.length();
        int op = 0, cl = 0, ans = 0;
        if (n % 2 != 0) {
            ans = -1;

        } else {
            for (int i = 0; i < n; i++) {
                if (st.charAt(i) == '{') {
                    op++;
                } else {
                    if (op == 0)
                        cl++;
                    else
                        op--;
                }

            }
            // ans = Math.round( (float) op/2.0) + Math.round((float) cl/2.0);
            ans = (int) (Math.ceil((float) op / 2) + Math.ceil((float) cl / 2));

        }
        System.out.println(ans);
    }
}
