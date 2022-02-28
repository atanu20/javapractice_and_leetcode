package string;

public class Print_all_subsequences_of_a_string {
    public static void printSubSeq(String sub,
            String ans) {

        if (sub.length() == 0) {
            System.out.print("" + ans + " ");
            return;
        }

        // Excluding first character
        printSubSeq(sub.substring(1), ans);

        // Including first character
        printSubSeq(sub.substring(1), ans + sub.charAt(0));
    }

    // Driver code
    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4 };
        // String str = "";
        // for (int vs : a) {
        // str += vs;

        // }
        String str = "abc";

        // System.out.println(str);
        printSubSeq(str, "");
    }
}
