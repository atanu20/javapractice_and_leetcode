package search;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        char tempArray[] = str.toCharArray();
        char st[] = str.toCharArray();
        // String temp=str;
        Arrays.sort(tempArray);
        System.out.println(tempArray);
        for (int i = 0; i < n; i++) {
            if (tempArray[i] != st[i]) {
                char a = tempArray[i];
                tempArray[i] = tempArray[n - i - 1];
                tempArray[n - i - 1] = a;
            }
        }
        String tp = "";
        for (int i = 0; i < n; i++) {
            tp += tempArray[i];
        }
        System.out.println(str + " " + tp);

        if (str.equals(tp)) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}