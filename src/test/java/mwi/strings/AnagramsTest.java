package mwi.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramsTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            'cde', 'dcf', 2
            'cde', 'abc', 4
            """)
    void countsDeletions(String a, String b, int result) {
        //given
        //when
        int actual = Anagrams.makeAnagram(a, b);

        //then
        assertThat(actual).isEqualTo(result);


    }

}