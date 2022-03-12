package linkedlist_work;

public class Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //
        List<String> ll = new ArrayList<>();
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            m.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        String minele = "";
        for (int i = 0; i < list2.length; i++) {
            if (m.containsKey(list2[i])) {
                int val = m.get(list2[i]);
                int mi = val + i;
                if (min > mi) {
                    min = mi;

                    ll.clear();
                    ll.add(list2[i]);
                } else if (min == mi) {
                    ll.add(list2[i]);
                }
            }
        }
        // String []a=new String[ll.size()];
        // for(int i=0;i<ll.size();i++)
        // {
        // a[i]=ll.get(i);
        // }

        // return a;
        return ll.toArray(new String[ll.size()]);
    }
}
