package leetcode;

public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
}
