import java.util.*;

public class Code {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr[] = sc.nextLine().split(",");

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        String ans = "";

        for (char ch : set) {
            int firstIndex = -1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    firstIndex = i;
                    break;
                }
            }

            String temp = arr[firstIndex];
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i) && !arr[i].equals(temp)) {
                    check = false;
                    break;
                } else if (ch != str.charAt(i) && arr[i].equals(temp)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                ans += ch;
            }

        }

        System.out.println((ans.length() == 0) ? "NA" : ans);
    }
}
