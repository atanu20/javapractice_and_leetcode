package gfg;

import java.util.*;

public class Alternate_positive_and_negative_numbers {
    void rearrange(int arr[], int n) {

        ArrayList<Integer> posNums = new ArrayList<>();
        ArrayList<Integer> negNums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                posNums.add(arr[i]);
            } else {
                negNums.add(arr[i]);
            }
        }

        int posIndex = 0, negIndex = 0, i = 0;

        while (posIndex < posNums.size() && negIndex < negNums.size()) {

            if (i % 2 == 0) {
                arr[i] = posNums.get(posIndex);
                posIndex++;
                i++;
            } else {
                arr[i] = negNums.get(negIndex);
                negIndex++;
                i++;
            }

        }

        while (posIndex < posNums.size()) {
            arr[i] = posNums.get(posIndex);
            posIndex++;
            i++;
        }

        while (negIndex < negNums.size()) {
            arr[i] = negNums.get(negIndex);
            negIndex++;
            i++;
        }

    }
}
