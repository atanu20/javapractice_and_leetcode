package array;

import java.util.*;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        // System.out.println(m);

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (m.containsKey(c) && m.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
