package string;

import java.util.Arrays;
// import java.util.Scanner;

public class checkSuffale {
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = { "1XxY2", "Y1X2", "Y21XX" };

        String con = first + second;

        char[] charArray = con.toCharArray();
        Arrays.sort(charArray);
        con = String.valueOf(charArray);

        for (String val : results) {
            char[] cha = val.toCharArray();
            Arrays.sort(cha);
            String va = String.valueOf(cha);
            if (con.length() != va.length()) {
                System.out.println(val + " is not a suffale of " + first + " and " + second);
            } else {
                if (con.equals(va)) {
                    System.out.println(val + " is a suffale of " + first + " and " + second);
                } else {
                    System.out.println(val + " is not suffale of " + first + " and " + second);
                }
            }
        }

    }
}
