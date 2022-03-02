package string;

import java.util.HashMap;
import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "ecfbefdcfca";
        String s2 = "badfcbebbf";
        Map<Character, Integer> map = new HashMap<>();
        // Map<Character, Integer> mapp = new HashMap<>();

        int s1l = s1.length();
        int s2l = s2.length();
        int c = 0;
        if (s1l == s2l) {
            for (int i = 0; i < s1l; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    // System.out.println(s1.charAt(i) + " " + s2.charAt(i));

                } else {
                    s1.replace(s1.charAt(i), s2.charAt(i));
                    c++;
                }
            }
        } else if (s1l < s2l) {
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < s1l; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    break;

                }
                c1++;
            }

            int l1 = s1l - 1;
            int l2 = s2l - 1;

            while (l1 >= 0 && l2 >= 0) {
                if (s1.charAt(l1) != s2.charAt(l2)) {
                    break;

                }
                c2++;

                // System.out.println(s1.charAt(l1) + "" + s2.charAt(l2));
                l1--;
                l2--;
            }

            String sub1 = s2.substring(0, c1);
            String sub2 = s2.substring(s2l - c2);
            String mid1 = s1.substring(c1, s1l - c2);
            String mid2 = s2.substring(c1, s2l - c2);

            // System.out.println(sub1 + "-" + sub2 + "-" + mid1 + "-" + mid2);
            // System.out.println(c1 + " " + c2);
            if (s1l == (c1 + c2)) {
                System.out.println(s2l - s1l);
            } else {

                for (int i = 0; i < mid2.length(); i++) {
                    if (map.containsKey(mid2.charAt(i))) {
                        map.put(mid2.charAt(i), map.get(mid2.charAt(i)) + 1);
                    } else {
                        map.put(mid2.charAt(i), 1);
                    }
                }
                // System.out.println(map);
                for (int i = 0; i < mid1.length(); i++) {

                    if (map.containsKey(mid1.charAt(i))) {
                        if (map.get(mid1.charAt(i)) == 1) {
                            map.remove(mid1.charAt(i));
                        } else {
                            map.put(mid1.charAt(i), map.get(mid1.charAt(i)) - 1);
                        }
                    }
                }
                // System.out.println(map);
                // int sum = 0;
                for (Map.Entry<Character, Integer> entry : map.entrySet())
                    c += entry.getValue();

                // System.out.println(sum);
            }

        } else if (s1l > s2l) {
            for (int i = 0; i < s1.length(); i++) {
                if (map.containsKey(s1.charAt(i))) {
                    map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
                } else {
                    map.put(s1.charAt(i), 1);
                }
            }
            System.out.println(map);

            for (int i = 0; i < s2.length(); i++) {

                if (map.containsKey(s2.charAt(i))) {
                    if (map.get(s2.charAt(i)) == 1) {
                        map.remove(s2.charAt(i));
                    } else {
                        map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                    }
                }
            }
            System.out.println(map);

            // ecfbefdcfca
            // badfcbebbf
            for (Map.Entry<Character, Integer> entry : map.entrySet())
                c += entry.getValue();
        }
        System.out.println(c);
    }
}
