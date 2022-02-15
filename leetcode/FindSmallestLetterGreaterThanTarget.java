package leetcode;

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int n = letters.length;
        int e = n - 1;

        if (letters[n - 1] <= target || letters[0] > target)
            return letters[0];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (letters[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return letters[s % n];

    }
}
