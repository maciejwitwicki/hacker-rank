package mwi.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagrams {
    public static int makeAnagram(String a, String b) {

        Map<Character, Integer> aChars = stringToCharacterMapCount(a);
        Map<Character, Integer> bChars = stringToCharacterMapCount(b);

        for (Map.Entry<Character, Integer> e: new HashSet<Map.Entry<Character, Integer>>(aChars.entrySet())) {
            char key = e.getKey();
            Integer aCount = e.getValue();
            Integer bCount = bChars.get(key);
            if (bCount != null) {
                aChars.put(key, aCount - bCount);
                bChars.put(key, bCount - aCount);
            }
        }

        Map<Character, Integer> resultsMap = new HashMap<>();

        aChars.forEach((key, value) -> {
            if (value > 0) {
                resultsMap.put(key, value);
            }
        });
        bChars.forEach((key, value) -> {
            if (value > 0) {
                resultsMap.put(key, value);
            }
        });

        return resultsMap.values().stream()
                .reduce(Integer::sum)
                .orElse(0);
    }

    private static Map<Character, Integer> stringToCharacterMapCount(String input) {
        Map<Character, Integer> chars = new HashMap<>();

        for (char c : input.toCharArray()) {
            int count = chars.getOrDefault(c, 0);
            chars.put(c, count + 1);
        }

        return chars;
    }
}
