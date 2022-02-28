package string;

public class longest_palindrom {
    public static int check(String str) {

        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }
        return str.length();
    }

    static String longestPalin(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                int len = check(sub);
                if (len > max) {
                    max = len;
                    ans = sub;
                }
            }
        }
        return ans;
    }
}
