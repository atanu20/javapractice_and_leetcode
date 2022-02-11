
public class GfgString {

    static int minSwaps(String arr[], int n) {

        int numberOfOnes = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == "A")
                numberOfOnes++;
        }

        int x = numberOfOnes;

        int count_ones = 0, maxOnes;

        for (int i = 0; i < x; i++) {
            if (arr[i] == "A")
                count_ones++;
        }

        maxOnes = count_ones;

        for (int i = 1; i <= n - x; i++) {

            if (arr[i - 1] == "A")
                count_ones--;

            if (arr[i + x - 1] == "A")
                count_ones++;

            if (maxOnes < count_ones)
                maxOnes = count_ones;
        }

        int numberOfZeroes = x - maxOnes;

        return numberOfZeroes == 0 ? -1 : numberOfZeroes;
    }

    public static void main(String args[]) {
        String a[] = { "A", "B", "A", "B", "A" };
        int n = a.length;

        System.out.println(minSwaps(a, n));
    }
}
