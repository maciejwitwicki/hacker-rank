package mwi.dictionaries;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            'attack at dawn',                       'Attack at dawn',         No
            'Attack at dawn',                       'Attack at dawn',         Yes
            'give me one grand today night',        'give one grand today',   Yes
            'two times three is not four',          'two times two is four',  No
            'ive got a lovely bunch of coconuts',   'ive got some coconuts',  No
            """)
    void testCase(String dictStr, String noteStr, String expectedResult) {
        //given
        var dict = Arrays.asList(dictStr.split(" "));
        var note = Arrays.asList(noteStr.split(" "));

        //when
        var result = RansomNote.doCheckMagazinePrimarySolution(dict, note);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}