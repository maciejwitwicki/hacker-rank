package mwi.dynamicprogramming;

public class MaxArraySum {


    static int maxSubsetSum(int[] arr) {

        int[] maxResults = new int[arr.length];

        maxResults[0] = Math.max(0, arr[0]);
        maxResults[1] = Math.max(arr[0], arr[1]);

        int topResult = Math.max(maxResults[0], maxResults[1]);

        for (int i = 2; i < arr.length; i++) {
            int currentValue = arr[i];
            int currentResult = Math.max(currentValue, Math.max(topResult, maxResults[i - 2] + arr[i]));
            maxResults[i] = currentResult;
            topResult = Math.max(topResult, currentResult);
        }

        return topResult;
    }


}
