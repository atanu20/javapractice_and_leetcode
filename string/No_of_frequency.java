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

        /*
         * HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
         * StringBuilder k = new StringBuilder("");
         * for(int i=0;i<s.length();i++)
         * {
         * if(hm.containsKey(s.charAt(i)))
         * {
         * hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
         * }
         * else{
         * hm.put(s.charAt(i),1);
         * }
         * }
         * List<Map.Entry<Character, Integer> > list
         * = new LinkedList<Map.Entry<Character, Integer> >(
         * hm.entrySet());
         * Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
         * for (Map.Entry<Character, Integer> aa : list) {
         * int a=aa.getValue();
         * char c=aa.getKey();
         * for(int i=0;i<a;i++)
         * {
         * k.append(c);
         * }
         * }
         * 
         * return k.reverse().toString();
         */

    }
}
