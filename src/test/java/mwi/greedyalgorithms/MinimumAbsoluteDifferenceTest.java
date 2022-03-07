package mwi.greedyalgorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumAbsoluteDifferenceTest {

    @ParameterizedTest
    @MethodSource("exampleValues")
    void testExample(List<Integer> input, Integer expected) {
        //given

        //when
        int result = MinimumAbsoluteDifference.minimumAbsoluteDifference(input);

        //then
        assertThat(result).isEqualTo(expected);
    }


    private static Stream<Arguments> exampleValues() {
        return Stream.of(
          Arguments.of( Arrays.asList(3, -7, 0), 3),
          Arguments.of( Arrays.asList(-59,-36,-13,1,-53,-92,-2,-96,-54,75), 1),
          Arguments.of( Arrays.asList(1, -3, 71,68,17), 3)
        );
    }

}