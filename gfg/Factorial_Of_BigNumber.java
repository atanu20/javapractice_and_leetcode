package gfg;

import java.util.*;

public class Factorial_Of_BigNumber {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        java.math.BigInteger f = new java.math.BigInteger("1");
        int ans = 0;
        for (int i = 2; i <= N; i++)
            f = f.multiply(java.math.BigInteger.valueOf(i));

        String s = String.valueOf(f);
        for (int i = 0; i < s.length(); i++) {
            ans = Integer.parseInt(String.valueOf(s.charAt(i)));
            al.add(ans);
        }

        return al;
    }

}
