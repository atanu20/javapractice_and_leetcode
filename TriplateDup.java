import java.util.*;

public class TriplateDup {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 2 };
        List<Integer> list = new ArrayList<Integer>();

        for (int n : nums) {
            list.add(n);
        }
        for (int n : nums) {

            if (Collections.frequency(list, n) == 1) {
                System.out.println(n);
            }
        }

        // String str = "Geeks";

        // // Creating array and Storing the array
        // // returned by toCharArray()
        // char[] ch = str.toCharArray();

        // // Printing array
        // for (char c : ch) {
        // System.out.println((int) c);
        // }
        // System.out.println((char) 65);
    }
}
