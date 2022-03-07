package mwi.search;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IceCreamParlor {
    public static void whatFlavors(List<Integer> cost, int money) {
        List<Integer> result = doWhatFlavors(cost, money);
        System.out.printf("%d %d%n", result.get(0) + 1, result.get(1) + 1);
    }

    static List<Integer> doWhatFlavors(List<Integer> cost, int money) {

        Map<Integer, Integer> valueToPos = new HashMap<>();

        for (int currentPos = 0; currentPos < cost.size(); currentPos++) {

            int currentValue = cost.get(currentPos);
            int requiredCompliment = money - currentValue;
            Integer complimentPosition = valueToPos.get(requiredCompliment);

            if (complimentPosition != null) {
                return Stream.of(currentPos, complimentPosition).sorted().collect(Collectors.toList());
            }

            valueToPos.put(currentValue, currentPos);
        }

        throw new RuntimeException("Solution not found, that's not possible!");

    }
}
