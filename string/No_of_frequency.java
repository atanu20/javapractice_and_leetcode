package string;

import java.util.*;

public class No_of_frequency {
    public static void main(String[] args) {
        String str = "acAbBABaca";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        int n = map.size();

        while (n-- > 0) {
            int currentMax = 0;
            char arg_max = 0;
            for (Map.Entry<Character, Integer> it : map.entrySet()) {
                if (it.getValue() >= currentMax && it.getKey() > arg_max) {
                    currentMax = it.getValue();
                    arg_max = it.getKey();
                }
            }
            // System.out.print(arg_max + " - " +
            // currentMax + "\n");
            String st = "";
            for (int i = 0; i < currentMax; i++) {
                st += arg_max;

            }
            System.out.print(st);

            // Delete the maximum value
            map.remove(arg_max);

        }

    }
}
