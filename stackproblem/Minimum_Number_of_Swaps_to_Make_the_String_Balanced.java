package stackproblem;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
    public int minSwaps(String s) {
        int swap = 0, close = 0, open = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ']') {
                close++;
                if (close > open) {
                    open++;
                    swap++;
                    close--;
                }
            } else {
                open++;
            }
        }
        return swap;
    }
}
