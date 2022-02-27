package search;

public class test {
    public static void main(String[] args) {

    }

    public void check(String s) {
        String[] arr = s.split("\n");
        for (int i = 1; i < arr.length; i = i + 3) {
            int ans = -1;
            int arrlen = Integer.parseInt(arr[i]);
            String strarr[] = arr[i + 1].split(" ");
            int key = Integer.parseInt(arr[i + 2]);

            for (int ii = 0; ii < strarr.length; ii++) {
                if (Integer.parseInt(strarr[ii]) == key) {
                    ans = ii;
                }
            }
            System.out.println(ans);
            ;

        }

    }
}
