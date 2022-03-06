package mwi.basics;

import org.assertj.core.api.AbstractLongAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RepeatedStringsTest {

    @Test
    void testShortString() {
        RepeatedStrings toTest = new RepeatedStrings();
        AbstractLongAssert<?> result = assertThat(toTest.repeatedString("aba", 10));
        result.isEqualTo(7);
    }

    @Test
    void testLongString() {
        RepeatedStrings toTest = new RepeatedStrings();
        long result = toTest.repeatedString("a", 1000000000000L);
        assertThat(result).isEqualTo(1000000000000L);
    }

}