package mwi.basics;

public class RepeatedStrings {

    public long repeatedString(String s, long n) {

        int stringLength = s.length();

        long repeats = n / (long) stringLength;

        long fullStringsLength = repeats * stringLength;

        long remainingStringLength = n - fullStringsLength;
        String remainingString = s.substring(0, (int) remainingStringLength);

        int aInSingleString = findAsIn(s);
        long allAinFullStrings = aInSingleString * repeats;

        return allAinFullStrings + findAsIn(remainingString);
    }

    private int findAsIn(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }


}
