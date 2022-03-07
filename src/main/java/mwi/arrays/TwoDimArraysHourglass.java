package mwi.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoDimArraysHourglass {

    public static int hourglassSum(List<List<Integer>> arr) {

        List<Hourglass> hourglasses = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                List<Integer> temp = new ArrayList<>();
                temp.addAll(arr.get(i).subList(j, j + 3));
                temp.add(arr.get(i + 1).get(j + 1));
                temp.addAll(arr.get(i + 2).subList(j, j + 3));
                hourglasses.add(new Hourglass(temp));
            }
        }

        return hourglasses.stream()
                .map(Hourglass::getSum)
                .max(Comparator.comparingInt(i -> i))
                .orElseThrow(() -> new RuntimeException("No hourglasses!"));
    }

    static class Hourglass {
        private final List<Integer> items;

        public Hourglass(List<Integer> items) {
            this.items = items;
        }

        public int getSum() {
            return items.stream().reduce(Integer::sum)
                    .orElseThrow(() -> new RuntimeException("Empty items!"));
        }
    }


}
