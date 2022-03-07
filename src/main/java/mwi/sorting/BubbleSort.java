package mwi.sorting;

import java.util.List;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {

        SortResult result = doCountSwaps(a);

        System.out.printf("Array is sorted in %d swaps.%n", result.swaps);
        System.out.printf("First Element: %d%n", result.first);
        System.out.printf("Last Element: %d%n", result.last);

    }

    public static SortResult doCountSwaps(List<Integer> a) {

        int length = a.size();

        int swapCount = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                int curr = a.get(j);
                int next = a.get(j + 1);
                if (curr > next) {
                    swapCount++;
                    a.set(j, next);
                    a.set(j + 1, curr);
                }
            }
        }


        return new SortResult(swapCount,a.get(0), a.get(length -1));
    }



    static class SortResult {
        private final int swaps;
        private final int first;
        private final int last;

        public SortResult(int swaps, int first, int last) {
            this.swaps = swaps;
            this.first = first;
            this.last = last;
        }

        public int getSwaps() {
            return swaps;
        }

        public int getFirst() {
            return first;
        }

        public int getLast() {
            return last;
        }

    }
}
