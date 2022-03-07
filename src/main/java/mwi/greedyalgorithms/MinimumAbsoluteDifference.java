package mwi.greedyalgorithms;

import java.util.Comparator;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static int minimumAbsoluteDifference(List<Integer> arr) {

        arr.sort(Comparator.naturalOrder());

        int minDiff = Integer.MAX_VALUE;


        for (int i = 0; i < arr.size() - 1; i++) {
            minDiff = Math.min(minDiff, Math.abs(arr.get(i) - arr.get(i + 1)));
        }

        return minDiff;
    }

}
