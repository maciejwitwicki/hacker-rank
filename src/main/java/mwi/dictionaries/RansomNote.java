package mwi.dictionaries;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        System.out.println(doCheckMagazineLegacyHackerRankJava8CompatibleSolution(magazine, note));
    }

    public static String doCheckMagazineLegacyHackerRankJava8CompatibleSolution(List<String> magazine, List<String> note) {
        Map<String, Integer> dictionary = magazine.stream()
                .collect(Collectors.groupingBy(word -> word)).entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<String, Integer>(e.getKey(), e.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        for (String word : note) {
            Integer foundWordCount = dictionary.get(word);

            if (foundWordCount == null || foundWordCount < 1) {
                return "No";
            }

            dictionary.put(word, foundWordCount - 1);
        }
        return "Yes";
    }

    public static String doCheckMagazinePrimarySolution(List<String> magazine, List<String> note) {
        Map<String, Integer> dictionary = magazine.stream()
                .collect(Collectors.groupingBy(word -> word)).entrySet().stream()
                .map(e -> Map.entry(e.getKey(), e.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        for (String word : note) {
            Integer foundWordCount = dictionary.get(word);

            if (foundWordCount == null || foundWordCount < 1) {
                return "No";
            }

            dictionary.put(word, foundWordCount - 1);
        }
        return "Yes";
    }
}
