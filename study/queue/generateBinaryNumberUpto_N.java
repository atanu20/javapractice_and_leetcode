package study.queue;

import java.util.*;

public class generateBinaryNumberUpto_N {
    static ArrayList<String> generate(int n) {
        ArrayList<String> list = new ArrayList<String>();
        Queue<String> qu = new LinkedList<>();
        qu.offer("1");
        for (int i = 0; i < n; i++) {
            String a = qu.poll();
            list.add(a);
            String n1 = list.get(i) + "0";
            String n2 = list.get(i) + "1";
            qu.offer(n1);
            qu.offer(n2);
        }

        return list;

    }
}
